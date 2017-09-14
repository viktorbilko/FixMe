package servise;

import ao.MacDao;
import molel.Mac;

import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class MacService {

    void save(Mac mac) {

    }

    List<Mac> getAll() {
        return new MacDao().getAll();
    }

    Mac update(Mac mac) {
        return new MacDao().update(mac);
    }

    void delete(Mac mac) {
        new MacDao().delete(mac);
    }
}
