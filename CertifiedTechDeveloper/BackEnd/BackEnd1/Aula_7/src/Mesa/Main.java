package Mesa;

public class Main {
    public static void main(String[] args) {
        TreeFlyweightFactory tree = new TreeFlyweightFactory();

        Tree ornamentais = tree.getTree(200, 400, "Verde");
        Tree frutiferas = tree.getTree(500, 300, "Vermelho");
        Tree floriferas = tree.getTree(100, 200, "Azul");

        System.out.println(ornamentais.toString());
        System.out.println(frutiferas.toString());
        System.out.println(floriferas.toString());
    }
}
