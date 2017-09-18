package dao.impl;

import dao.MacDao;
import database.Storage;
import model.Mac;

import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class MacDaoImpl implements MacDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void save(Mac mac) {
        new Storage().addMac(mac);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<Mac> getAll() {
        return Storage.getList();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Mac update(Mac mac) {
        List<Mac> list = Storage.getList();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getType().equals(mac.getType())) {
                    list.set(i, mac);
                }
            }

        return mac;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void delete(Mac mac) {
        List<Mac> list = Storage.getList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(mac)) {
                list.remove(i);
            }
        }
    }
}
