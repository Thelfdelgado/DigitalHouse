package Mesa;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Inteiros {

    private static final Logger logger = Logger.getLogger(Inteiros.class);
    private List<Integer> listaInteiros = new ArrayList<>();

    public void calcularMedia(){
        int contador = 0;
        for (int i = 0; i < listaInteiros.size(); i++){
            contador += listaInteiros.get(i);
        }
        int calcularMedia = contador / listaInteiros.size();
        logger.info("Media " + calcularMedia);
    }

    public void calculo() throws Exception {
        if (listaInteiros.size() > 5){
            logger.info("Mais de 5 itens");
        } else if (listaInteiros.size() > 10) {
            logger.info("Mais de 10 itens");
        } else if (listaInteiros.size() == 0) {
            logger.error("Elementos insuficientes");
            throw new Exception();
        }
    }

    public void addNumber(int inteiro){
        listaInteiros.add(inteiro);
    }
}
