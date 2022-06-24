import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dock {
    private List<Container> containers = new ArrayList<Container>();

    public void addContainer(Container container) {
        containers.add(container);
    }

    public void removeContainer(int number) {
        containers.remove(number);
    }

    public List<Container> getContainers() {
        return containers;
    }

    public List<Container> orderContainers() {
        List<Container> orderedContainers = new LinkedList<Container>();
        for (Container container : containers) {
            orderedContainers.add(container);
        }
        return orderedContainers;
    }

    public int getNumberOfHazardousContainers() {
        int numberOfHazardousContainers = 0;
        for (Container container : containers) {
            if (container.isHazardous()) {
                numberOfHazardousContainers++;
            }
        }
        return numberOfHazardousContainers;
    }
}
