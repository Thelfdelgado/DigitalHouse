package Aula13;

public abstract class Conta {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}
