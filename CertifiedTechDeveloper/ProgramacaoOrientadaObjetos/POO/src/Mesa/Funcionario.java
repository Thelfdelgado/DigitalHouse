package Mesa;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private String matricula;

    public Funcionario(
            String nome,
            double salario,
            String matricula
    ) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public double addAumento(double valor) {
        return salario * 2;
    }

    public double ganhoAnual() {
        return salario * 12;
    }

    public String exibeDados() {

    }
}
