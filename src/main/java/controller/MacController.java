package controller;

import database.Storage;
import lombok.val;
import model.Mac;
import model.Owner;
import service.factory.ServiceFactory;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class MacController {

    public static void main(String[] args) throws Exception {

        val macService = ServiceFactory.getMacService();

        Mac mac1 = new Mac(
                "MacBook",
                "Air",
                "2.5",
                25000,
                "grey",
                new Owner(
                        "Tom",
                        "manager"));

        Mac mac2 = new Mac(
                "MacBook",
                "Pro",
                "2",
                35000,
                "grey",
                new Owner(
                        "Bob",
                        "manager"));

        Mac mac3 = new Mac(
                "MacBook",
                "Pro",
                "2",
                22000,
                "grey",
                new Owner(
                        "Bob",
                        "manager"));

        macService.save(mac1);
        macService.save(mac2);

        List<Mac> allMac = macService.getAll();
        System.out.println(allMac);

        macService.delete(mac1);
        System.out.println(allMac);

        macService.update(mac3);
        System.out.println(allMac);

        //Hack private method getFirstMac
        Storage storage = new Storage();
        Class<? extends Storage> aClass = storage.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        String macName;
        Method getFirstMac = aClass.getDeclaredMethod("getFirstMac");
        getFirstMac.setAccessible(true);
        Object invoke = getFirstMac.invoke(aClass);

        if (invoke instanceof String) {
            macName = (String) invoke;
        } else {
            macName = null;
        }

        System.out.println(macName);
    }
}
