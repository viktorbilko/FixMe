package molel;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class Mac {

    private String name;
    private String type;
    private String weight;
    private double price;
    private String color;
    private Owner owner;


    public Mac() {
    }

    public Mac(String name, String type, String weight, double price, String color, Owner owner) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mac mac = (Mac) o;

        if (Double.compare(mac.price, price) != 0) return false;
        if (name != null ? !name.equals(mac.name) : mac.name != null) return false;
        if (type != null ? !type.equals(mac.type) : mac.type != null) return false;
        if (weight != null ? !weight.equals(mac.weight) : mac.weight != null) return false;
        if (color != null ? !color.equals(mac.color) : mac.color != null) return false;
        return owner != null ? owner.equals(mac.owner) : mac.owner == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight='" + weight + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", owner=" + owner +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

