package Mesa;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Inteiros {

    // Objetos
    private static final Logger logger = Logger.getLogger(Inteiros.class);
    private List<Integer> listaInteiros = new ArrayList<>();

    // Methods
    public void addNumber(int inteiro){
        listaInteiros.add(inteiro);
    }

    public void calculo() throws Exception {
        int contador = 0;

        for (int i = 0; i < listaInteiros.size(); i++){
            contador += listaInteiros.get(i);
        }
        int calcularMedia = contador / listaInteiros.size();
        logger.info("Media " + calcularMedia);

        if (calcularMedia >= 5 && calcularMedia < 10){
            logger.info("Maior ou igual a 5 itens");
        } else if (calcularMedia >= 10) {
            logger.info("Maior ou igual a 10 itens");
        } else if (calcularMedia == 0) {
            logger.error("Igual a zero");
            throw new Exception();
        }
    }
}
