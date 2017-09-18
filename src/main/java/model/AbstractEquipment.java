package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by vertex0002 on 14.09.2017.
 */
@Data
@AllArgsConstructor
public abstract class AbstractEquipment {
    private String name;
    private String type;
    private String weight;
    private double price;
    private String color;
    private Owner owner;
}
