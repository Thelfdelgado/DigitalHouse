package Aula;

public class Main {
    public static void main(String[] args) {
        ComputerFlyweightFactory computer = new ComputerFlyweightFactory();

        Computer mac = computer.getComputer(16, 500);
        Computer win = computer.getComputer(2, 250);
        Computer mac2 = computer.getComputer(2, 250);

        System.out.println(mac2.toString());
        System.out.println(mac.toString());
        System.out.println(win.toString());
    }
}
