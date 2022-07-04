import java.util.Date;

public abstract class Project {
    private Integer iD;
    private String name;
    private String city;
    private Construction construction;
    private ProjectStatus status;

    public Project(Integer iD, String name, String city, Construction construction, ProjectStatus status) {
        this.iD = iD;
        this.name = name;
        this.city = city;
        this.construction = construction;
        this.status = status;
    }

    public Integer getID() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Construction getConstruction() {
        return construction;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Project{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", status=" + status +
                '}';
    }

    public void finishConstruction(Date date) {
        this.status = ProjectStatus.COMPLETED;
        this.construction.finishConstruction(date);
    }
    public void printCompletedOnTime() {
        if (this.status.equals(ProjectStatus.COMPLETED) == false) {
            System.out.println("Project was not completed yet.");
            return;
        }
        if (
            this.construction.getEndingDate().after(this.construction.getExpectedDate())) {
            System.out.println("Project " + name + " was not completed on time");
        } else {
            System.out.println("Project " + name + " was completed on time");
        }
    }

}
