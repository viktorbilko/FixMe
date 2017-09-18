package dao.factory;

import dao.*;
import dao.impl.IphoneDaoImpl;
import dao.impl.MacDaoImpl;
import dao.impl.OwnerDaoImpl;
import dao.impl.PowerBankDaoImpl;
import model.Mac;

/**
 * Created by vertex0002 on 14.09.2017.
 */
public class DaoFactory {

    /**
     * @return {@link IphoneDaoImpl}.
     */
    public static IphoneDao getIphoneDao(){
        return new IphoneDaoImpl();
    }

    /**
     * @return {@link MacDaoImpl}.
     */
    public static MacDao getMacDao(){
        return new MacDaoImpl();
    }

    /**
     * @return {@link PowerBankDaoImpl}.
     */
    public static PowerBankDao getPowerBankDao(){
        return new PowerBankDaoImpl();
    }

    /**
     * @return {@link OwnerDaoImpl}.
     */
    public static OwnerDao getOwnerDao(){
        return new OwnerDaoImpl();
    }
}
