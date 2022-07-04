public class BuildingProject extends Project implements Comparable<BuildingProject> {

    private Integer numberOfFloors;
    private Integer numberOfApartmentsPerFloor;

    public BuildingProject(Integer iD, String name, String city, Construction construction, ProjectStatus status, Integer numberOfFloors, Integer numberOfApartmentsPerFloor) {
        super(iD, name, city, construction, status);
        this.numberOfFloors = numberOfFloors;
        this.numberOfApartmentsPerFloor = numberOfApartmentsPerFloor;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public Integer getNumberOfApartmentsPerFloor() {
        return numberOfApartmentsPerFloor;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setNumberOfApartmentsPerFloor(Integer numberOfApartmentsPerFloor) {
        this.numberOfApartmentsPerFloor = numberOfApartmentsPerFloor;
    }

    @Override
    public String toString() {
        return "BuildingProject{" +
                "numberOfFloors=" + numberOfFloors +
                ", numberOfApartmentsPerFloor=" + numberOfApartmentsPerFloor +
                '}';
    }

    @Override
    public int compareTo(BuildingProject o) {
        return this.getNumberOfApartments().compareTo(o.getNumberOfApartments());
    }

    public Integer getNumberOfApartments() {
        return numberOfFloors * numberOfApartmentsPerFloor;
    }

    public Boolean isSkyScraper() {
        return numberOfFloors > 15;
    }
    
}
