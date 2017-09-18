package service;

import model.Owner;

import java.util.List;

/**
 * Created by vertex0002 on 14.09.2017.
 */
public interface OwnerService {

    void save(Owner owner);

    List<Owner> getAll();

    Owner update(Owner owner);

    void delete(Owner owner);

}
