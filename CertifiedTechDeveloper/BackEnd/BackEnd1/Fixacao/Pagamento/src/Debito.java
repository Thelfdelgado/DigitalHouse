import java.time.LocalDate;

public class Debito extends Card{
    private double saldoDisponivel;

    public Debito(int cardNum, int cod, LocalDate dataValidade, double saldoDisponivel) {
        super(cardNum, cod, dataValidade);
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public void imprimirRecibo(double quantia) {

    }

    @Override
    public double autorizado() {
        return 0;
    }
}
