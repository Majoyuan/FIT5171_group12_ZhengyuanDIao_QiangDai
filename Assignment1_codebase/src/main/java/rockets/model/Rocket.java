package rockets.model;

import java.util.Objects;

import static org.apache.commons.lang3.Validate.notBlank;
import static org.apache.commons.lang3.Validate.notNull;

public class Rocket extends Entity {
    private String name;

    private String nationality;

    private String manufacturer;

    private String massToGTO;

    private String massToLEO;

    private String massToOther;

    /**
     * All parameters shouldn't be null.
     *
     * @param name
     * @param nationality
     * @param manufacturer
     */
    public Rocket(String name, String nationality, String manufacturer) {
        notNull(name);
        notNull(nationality);
        notNull(manufacturer);

        this.name = name;
        this.nationality = nationality;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMassToGTO() {
        return massToGTO;
    }

    public String getMassToLEO() {
        return massToLEO;
    }

    public String getMassToOther() {
        return massToOther;
    }

    public void setMassToGTO(String massToGTO) {
        notBlank(massToGTO, "massToGTO cannot be empty or null");
        this.massToGTO = massToGTO;
    }

    public void setMassToLEO(String massToLEO) {

        notBlank(massToLEO, "massToLEO cannot be empty or null");
        this.massToLEO = massToLEO;
    }

    public void setMassToOther(String massToOther) {
        notBlank(massToOther, "massToOther cannot be empty or null");
        this.massToOther = massToOther;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rocket rocket = (Rocket) o;
        return Objects.equals(name, rocket.name) &&
                Objects.equals(nationality, rocket.nationality) &&
                Objects.equals(manufacturer, rocket.manufacturer)&&
                Objects.equals(massToGTO, rocket.massToGTO)&&
                Objects.equals(massToLEO, rocket.massToLEO)&&
                Objects.equals(massToOther, rocket.massToOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nationality, manufacturer);
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality+ '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", massToGTO='" + massToGTO + '\'' +
                ", massToLEO='" + massToLEO + '\'' +
                ", massToOther='" + massToOther + '\'' +
                '}';
    }
}
