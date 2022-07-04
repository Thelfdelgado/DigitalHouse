import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Date today = new Date();
        Date twoWeeksAgo = new Date(today.getTime() - (1000 * 60 * 60 * 24 * 14));
        Date twoMonthsFromNow = new Date(today.getTime() + (1000 * 60 * 60 * 24 * 60));


        // Create a new house project and a building project
        HouseProject houseProject = new HouseProject(
            1,
            "House Project",
            "New York", new Construction("123 Main Street", twoWeeksAgo, today), ProjectStatus.IN_PROGRESS, 100.0,
            2,
            3
        );
        BuildingProject buildingProject = new BuildingProject(
            2, 
            "Building Project", 
            "Las Vegas", 
            new Construction("142 Caligula Strip", twoWeeksAgo, today), 
            ProjectStatus.IN_PROGRESS, 20, 10
        );

        
        houseProject.finishConstruction(today);
        buildingProject.finishConstruction(twoMonthsFromNow);

        System.out.println(houseProject);
        System.out.println(buildingProject);

        houseProject.printCompletedOnTime();
        buildingProject.printCompletedOnTime();


    }

}
