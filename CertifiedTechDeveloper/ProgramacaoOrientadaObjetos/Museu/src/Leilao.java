import java.util.ArrayList;
import java.util.List;

public class Leilao implements Publicador{
    private final double valorInicial;
    private final double valor;
    private String descricao;

    private List<Observador> observadores;

    public Leilao(double valorInicial, double valor, String descricao) {
        this.valor = valor;
        this.valorInicial = valorInicial;
        this.descricao = descricao;
        observadores = new ArrayList<>();
    }

    public double getValorInicial() {

        return valorInicial;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    @Override
    public void notificar() {
        for (Observador observador: observadores) observador.receberNotificacao(getValor());
    }
}
