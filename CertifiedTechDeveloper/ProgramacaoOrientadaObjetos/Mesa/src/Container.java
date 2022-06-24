public class Container implements Comparable {
    private Integer number;
    private String description = null;
    private Country countryOfOrigin = Country.Unknown;
    private Boolean hasHazardousMaterial = false;

    public Container(int number) {
        this.number = number;
    }

    public Container(int number,Country countryOfOrigin) {
        this.number = number;
        this.countryOfOrigin = countryOfOrigin;
    }

    public Container(int number, Country countryOfOrigin, String description) {
        this.number = number;
        this.countryOfOrigin = countryOfOrigin;
        this.description = description;
    }

    public Container(int number, Country countryOfOrigin, Boolean hasHazardousMaterial) {
        this.number = number;
        this.countryOfOrigin = countryOfOrigin;
        this.hasHazardousMaterial = hasHazardousMaterial;
    }

    public Container(int number, Country countryOfOrigin, String description, Boolean hasHazardousMaterial) {
        this.number = number;
        this.countryOfOrigin = countryOfOrigin;
        this.description = description;
        this.hasHazardousMaterial = hasHazardousMaterial;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isHazardous() {
        return hasHazardousMaterial && countryOfOrigin.equals(Country.Unknown);
    }

    public String toString() {
        return "Container " + number + " from " + countryOfOrigin + " has " + description + " and is " + (hasHazardousMaterial ? "hazardous" : "not hazardous");
    }

    public int compareTo(Object o) {
        Container other = (Container) o;
        return this.number.compareTo(other.number);
    }

    
    
}
