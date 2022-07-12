import java.util.ArrayList;
import java.util.List;

public class VeiculoFerroviario extends Trem{
    private final List<Trem> pecas;

    public VeiculoFerroviario() {
        pecas = new ArrayList<>();
    }

    public void addpecas(Trem trem) {
        pecas.add(trem);
    }
}
