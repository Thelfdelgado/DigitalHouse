public class HouseProject extends Project {
    private Double terrainArea;
    private Integer numberOfBathrooms;
    private Integer numberOfBedrooms;

    public HouseProject(Integer iD, String name, String city, Construction construction, ProjectStatus status, Double terrainArea, Integer numberOfBathrooms, Integer numberOfBedrooms) {
        super(iD, name, city, construction, status);
        this.terrainArea = terrainArea;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public Double getTerrainArea() {
        return terrainArea;
    }

    public Integer getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public Integer getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setTerrainArea(Double terrainArea) {
        this.terrainArea = terrainArea;
    }

    public void setNumberOfBathrooms(Integer numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setNumberOfBedrooms(Integer numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    @Override
    public String toString() {
        return "HouseProject{" +
                "terrainArea=" + terrainArea +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfBedrooms=" + numberOfBedrooms +
                '}';
    }
    
}
