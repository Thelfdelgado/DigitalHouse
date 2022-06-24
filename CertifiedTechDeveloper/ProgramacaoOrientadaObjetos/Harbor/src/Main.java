import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Container> containers = new ArrayList<>();
        containers.add(new Container("01", "Cars", "EUA", false));
        containers.add(new Container("02", "Meat", "Brazil", false));
        containers.add(new Container("03", "Electronics", "China", false));
        containers.add(new Container("04", "Guns", "Russia", true));
        containers.add(new Container("05", "Drugs", "Canada", true));
        containers.add(new Container("06", "Top Secret", "Unknown", true));

        Harbor harbor = new Harbor("Buenos Aires", containers);
        harbor.sortById();
        System.out.println(harbor);
    }
}
