import java.util.Objects;

public class ContratoMes extends Contrato {
    private Double salarioMes;
    private Integer totalHora;
    private Funcionario funcionario;

    public ContratoMes(Integer numMeses, String dataInicio, Boolean registro, Cargo cargo, Double salarioMes, Integer totalHora, Funcionario funcionario) {
        super(numMeses, dataInicio, registro, cargo);
        this.salarioMes = salarioMes;
        this.totalHora = totalHora;
        this.funcionario = funcionario;
    }

    public Double getSalarioMes() {
        return salarioMes;
    }

    public Integer getTotalHora() {
        return totalHora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setSalarioMes(Double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public void setTotalHora(Integer totalHora) {
        this.totalHora = totalHora;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Mensalista" + ("\n") +
                "Salario: " + salarioMes + ("\n") +
                "Total hora: " + totalHora + ("\n") + funcionario;
    }

    public void boss() {
        if (Objects.equals(this.getCargo(), Cargo.CHEFE)) {
            System.out.println("Chefe");
        }
    }
}