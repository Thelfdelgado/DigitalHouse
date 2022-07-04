import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PecaReposicao> pecas = new ArrayList<>();
        pecas.add(new PecaReposicao("motor", 50));

        Reparo reparo = new Reparo("Liquidificador", 100);
        reparo.proximo();
        reparo.getEstado().somaPecaReposicao(pecas);
        reparo.proximo();
        reparo.getEstado().mudarEndereco("Rua a, 1");
        reparo.proximo();

        if(reparo.getEstado() instanceof Finalizado) {
            System.out.println("Acabou!");
        }
    }
}
