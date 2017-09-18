package service.factory;

import model.PowerBank;
import service.IphoneService;
import service.MacService;
import service.OwnerService;
import service.PowerBankService;
import service.impl.IphoneServiceImpl;
import service.impl.MacServiceImpl;
import service.impl.OwnerServiceImpl;
import service.impl.PowerBankServiceImpl;

/**
 * Created by vertex0002 on 14.09.2017.
 */
public class ServiceFactory {

    /**
     * @return {@link MacServiceImpl}
     */
    public static MacService getMacService(){
        return new MacServiceImpl();
    }

    /**
     * @return {@link IphoneServiceImpl}
     */
    public static IphoneService getIphoneServise(){
        return new IphoneServiceImpl();
    }

    /**
     * @return {@link PowerBankServiceImpl}
     */
    public static PowerBankService getPowerBankService(){
        return new PowerBankServiceImpl();
    }

    /**
     * @return {@link OwnerServiceImpl}
     */
    public static OwnerService getOwnerService(){
        return new OwnerServiceImpl();
    }
}
