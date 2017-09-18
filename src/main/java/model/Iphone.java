package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class Iphone extends AbstractEquipment {

    public Iphone(String name, String type, String weight, double price, String color, Owner owner) {
        super(name, type, weight, price, color, owner);
    }
}
