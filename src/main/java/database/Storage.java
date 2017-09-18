package database;

import model.Mac;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class Storage {

    public static List<Mac> list = new LinkedList<>();

    public static List<Mac> getList() {
        return list;
    }

    public static void addMac(Mac mac) {
        list.add(mac);
    }

    /**
     * @return first element of mac list to controller.
     */
    private static String getFirstMac() { // todo do not change private and implements from controller to here
        if(list.size() != 0){
            return list.get(0).getName();
        } else {
            return null;
        }
    }
}
