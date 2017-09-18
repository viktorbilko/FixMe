package service;

import model.AbstractEquipment;

import java.util.List;

/**
 * Created by BilkoVV on 18.09.2017.
 */
public interface CrudService<T extends AbstractEquipment> {

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
