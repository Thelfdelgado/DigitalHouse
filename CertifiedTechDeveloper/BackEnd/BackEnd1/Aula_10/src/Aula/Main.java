package Aula;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        // Alternativa para configurar o log4j.properties
        BasicConfigurator.configure();

        Leao leao = new Leao("Simba", 8, true);
        Tigre tigre = new Tigre("Diego", 14);
        leao.correr();
        leao.eMaiorQue10();
        tigre.correr();
        tigre.eMaiorQue10();

        try {
            leao.eMaiorQue10();
        }
        catch (Exception e){
            logger.error("A idade do leao " + leao.getNome() + " esta incorreta!", e);
        }
    }
}
