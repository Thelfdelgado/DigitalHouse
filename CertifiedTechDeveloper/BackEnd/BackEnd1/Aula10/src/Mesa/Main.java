package Mesa;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Aula.Main.class);

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();

        Inteiros list = new Inteiros();
        Inteiros list1 = new Inteiros();
        Inteiros list2 = new Inteiros();

        list.addNumber(1);
        list.addNumber(2);
        list.addNumber(3);
        list.addNumber(4);
        list.addNumber(5);
        list.addNumber(6);
        list.addNumber(7);
        list.addNumber(8);
        list.addNumber(9);

        list.calculo();
        list.calcularMedia();
        list1.calculo();
        list1.calcularMedia();
        list2.calculo();
        list2.calcularMedia();

    }
}
