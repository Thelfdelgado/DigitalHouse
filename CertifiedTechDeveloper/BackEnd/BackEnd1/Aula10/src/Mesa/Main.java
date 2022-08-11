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

        list.addNumber(5);
        list1.addNumber(24);
        list2.addNumber(0);
        list.addNumber(5);
        list1.addNumber(5);
        list2.addNumber(0);
        list.addNumber(7);
        list1.addNumber(9);
        list2.addNumber(0);

        try {
            list.calculo();
            list1.calculo();
            list2.calculo();
        }
        catch (Exception e){
            logger.error("Valor igual a zero", e);
        }
    }
}
