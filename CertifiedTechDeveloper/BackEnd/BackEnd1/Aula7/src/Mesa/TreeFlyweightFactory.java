package Mesa;

import java.util.HashMap;
import java.util.Map;

public class TreeFlyweightFactory {
    private static Map<String, Tree> treeMap = new HashMap<>();

    public Tree getTree(int altura, int largura, String cor) {
        String treeId = "TreeId: " + altura + " : " + largura + " : " + cor;
        System.out.println(treeId);
        if (!treeMap.containsKey(treeId)) {
            treeMap.put(treeId, new Tree(altura, largura, cor));
            System.out.println("Arvore criada com sucesso");
        }
        System.out.println("Arvore obtida");
        return treeMap.get(treeId);
    }
}
