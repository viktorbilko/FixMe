package ao;

import database.Storage;
import molel.Mac;

import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class MacDao {

    public void save(Mac mac) {
        new Storage().addMac();
    }

    public List<Mac> getAll() {
        return null;
    }

    public Mac update(Mac mac) {
        return null;
    }

    public void delete(Mac mac) {

    }
}
