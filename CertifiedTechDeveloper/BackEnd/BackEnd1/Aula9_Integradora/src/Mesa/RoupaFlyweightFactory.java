package Mesa;

import java.util.HashMap;
import java.util.Map;

public class RoupaFlyweightFactory {
    public static Map<String, Roupa> mapTamanho = new HashMap<>();
    public static Map<Boolean, Roupa> mapNovoImportada = new HashMap<>();

    public static Roupa obterRoupa(Roupa roupa){
        String idRoupa = roupa.toString();
        Roupa tamanho = mapTamanho.get(idRoupa);
        Roupa importada = mapNovoImportada.get(idRoupa);
        System.out.println(idRoupa);

        if (tamanho == null){
            mapTamanho.put(idRoupa, roupa);
            System.out.println("Roupa Nova");
        }

        if (importada == null) {
            mapNovoImportada.put(Boolean.valueOf(idRoupa), roupa);
            System.out.println("Roupa Nova Importada");
        }
        System.out.println("Obtida");
        return roupa;
    }
}
