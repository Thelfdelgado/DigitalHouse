package Mesa;

public class Main {
    private static final String tipos[] = {"Ornamentais", "Frutiferas", "Floriferas"};

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++){
            Tree tree = TreeFlyweightFactory.getTree(aleatoria());
            tree.setAltura(i + 200);
            tree.setLargura(i + 400);
            tree.setCor("Cor: " + i + 2);

            tree.plantar();

            Runtime runtime = Runtime.getRuntime();
            System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
        }
    }

    private static String aleatoria(){
        return tipos[(int)(Math.random()*tipos.length)];
    }
}

