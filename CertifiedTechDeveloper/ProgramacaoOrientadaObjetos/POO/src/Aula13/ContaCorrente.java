package Aula13;

public class ContaCorrente extends Conta
        implements GravarImposto{
    private double valorPermitido;
    private double valor;

    public ContaCorrente(double valorPermitido) {
        this.valorPermitido = valorPermitido;
        this.valor = 0;
    }

    @Override
    public void sacar(double valor) {
        if (valor == 0 || valor > valorPermitido)
            throw new IllegalStateException("Valor invalido");

        this.valor = valor

        if (valor > getSaldo()) {
            setSaldo(0);
        } else {
            setSaldo(getSaldo() - valor);
        }
    }

    @Override
    public void imposto(double porc) {
        // TODO implementar desconto
        setSaldo(getSaldo() - (valor = + ((valor*porc)/100)));
    }
}
