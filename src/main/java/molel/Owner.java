package molel;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class Owner {

    private String name;
    private String jobPosition;

    public Owner() {
    }

    public Owner(String name, String jobPosition) {
        this.name = name;
        this.jobPosition = jobPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Owner owner = (Owner) o;

        if (name != null ? !name.equals(owner.name) : owner.name != null) return false;
        return jobPosition != null ? jobPosition.equals(owner.jobPosition) : owner.jobPosition == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (jobPosition != null ? jobPosition.hashCode() : 0);
        return result;
    }
}
