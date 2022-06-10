package Mesa;

public class Assistente extends Funcionario{
    public String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario, matricula);
        this.matricula = matricula;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados();
    }
}
