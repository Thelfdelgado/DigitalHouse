import java.util.Comparator;
import java.util.List;

public class Harbor {
    public String name;
    public List<Container> containers;

    public Harbor(String name, List<Container> containers) {
        this.name = name;
        this.containers = containers;
    }

    public String getName() {
        return name;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public int unknownContainers() {
        int i = 0;
        for (Container container: containers) {
            if (container.dangerous() && container.country().equals("Unknown")) {
                i++;
            }
        }
        return i;
    }

    public boolean allowContainer(Container container) {
        return !container.country().equals("Unknown");
    }

    public void addContainer(Container container) {
        containers.add(container);
    }

    public void removeContainer(Container container) {
        containers.remove(container);
    }

    @Override
    public String toString() {
        return "Harbor" + name + System.lineSeparator()
                + "Containers" + containers + System.lineSeparator()
                + "Unknown Containers" + unknownContainers() + System.lineSeparator();
    }

    public void sortById() {
        containers.sort(new Comparator<Container>() {
            @Override
            public int compare(Container o1, Container o2) {
                return o1.idNum().compareTo(o2.idNum());
            }
        });
    }
}
