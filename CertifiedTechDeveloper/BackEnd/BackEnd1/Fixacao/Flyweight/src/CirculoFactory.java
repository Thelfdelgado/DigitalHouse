import java.util.HashMap;

public class CirculoFactory {
    private static final HashMap<String, Circulo> circuloMap = new HashMap<>();

    public static Circulo obterCirculo(String cor){
        Circulo circulo = new Circulo(cor);

        if (circulo == null){
            circulo = new Circulo(cor);
            circuloMap.put(cor, circulo);
            System.out.println("Criar um circulo de cor: " + cor);
        }

        return circulo;
    }
}
