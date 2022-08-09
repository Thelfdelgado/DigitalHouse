package Mesa;

import java.util.HashMap;
import java.util.Map;

public class TreeFlyweightFactory {
    private static final Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String tipo) {
        Tree tree = new Tree(tipo);

        if (tree == null) {
            tree = new Tree(tipo);
            treeMap.put(tipo, tree);
            System.out.println("Nova arvore: " + tipo);
        }

        return tree;
    }
}
