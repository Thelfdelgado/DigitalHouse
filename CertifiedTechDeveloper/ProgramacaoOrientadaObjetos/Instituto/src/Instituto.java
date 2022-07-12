import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private final List<OfertaAcademica> programas;
    private final String nome;

    public Instituto(String nome) {
        this.nome = nome;
        this.programas = new ArrayList<>();
    }

    public void adicionar(OfertaAcademica programa) {
        this.programas.add(programa);
    }

    public void relatorio() {
        for (OfertaAcademica programa: programas) {
            System.out.println(programa);
        }
    }
}
