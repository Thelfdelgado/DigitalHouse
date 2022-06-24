import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Dock pier51 = new Dock();

        Container container1 = new Container(1, Country.China);
        Container container2 = new Container(2);
        Container container3 = new Container(3, Country.Brasil, true);
        Container container4 = new Container(4, Country.Russia, "weapons");
        Container container5 = new Container(5, Country.Canada);
        Container container6 = new Container(6, Country.Unknown, "dark matter", true);

        pier51.addContainer(container1);
        pier51.addContainer(container2);
        pier51.addContainer(container3);
        pier51.addContainer(container4);
        pier51.addContainer(container5);
        pier51.addContainer(container6);

        System.out.println(pier51.orderContainers());
        System.out.println(pier51.getNumberOfHazardousContainers());

    }
}