import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Credito extends Card{
    private double limite;
    private double saldoUtilizado;

    public Credito(int cardNum, int cod, LocalDate dataValidade, double limite, double saldoUtilizado) {
        super(cardNum, cod, dataValidade);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    public double autorizado() {
        if (saldoUtilizado >= limite){
            System.out.println("Nao autorizado");
        } else {
            System.out.println("Autorizado");
        }
        return 0;
    }

}
