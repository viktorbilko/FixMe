package service.impl;

import dao.factory.DaoFactory;
import lombok.val;
import model.Mac;
import service.MacService;

import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class MacServiceImpl implements MacService {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void save(Mac mac) {
        val macDao = DaoFactory.getMacDao();
        macDao.save(mac);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<Mac> getAll() {
        return DaoFactory.getMacDao().getAll();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Mac update(Mac mac) throws Exception {

        try {
            DaoFactory.getMacDao().update(mac);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (mac == null) {
            return null;
        } else
            return mac;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void delete(Mac mac) {
        DaoFactory.getMacDao().delete(mac);
    }
}
