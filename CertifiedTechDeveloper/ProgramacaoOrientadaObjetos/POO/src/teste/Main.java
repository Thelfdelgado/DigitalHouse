package teste;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Hello", ""};
        words[0] = "test";
        words[1] = "test";
        words[2] = "test";

        List<String> string = new ArrayList<>();
        string.add("Francisco");
        string.add("Bruno");
        string.add("Bruno");
        string.add("Rafael");
        string.remove(0);

        // Array
        // LinkedList -> remove os itens iguais e ordena
        // HashList -> remove os itens iguais e nao ordena
        // ArrayList -> nao remove e mantem como foi adicionado
    }
}
