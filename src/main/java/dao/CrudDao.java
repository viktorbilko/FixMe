package dao;

import database.Storage;
import model.AbstractEquipment;
import model.Mac;

import java.util.List;

/**
 * Created by vertex0002 on 14.09.2017.
 */
public interface CrudDao <T extends AbstractEquipment> {

    /**
     * @param type add to list equipment.
     */
    void save(T type);

    /**
     * @return list of equipments.
     */
    List<T> getAll();

    /**
     * @param type of equipment.
     * @return equipment.
     * @throws Exception
     */
    T update(T type) throws Exception;

    /**
     * @param type remove from list.
     */
    void delete(T type);
}
