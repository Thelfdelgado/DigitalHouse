public class ContratoHora extends Contrato implements Comparable<ContratoHora>{
    private Integer horaMes;
    private Double valorHora;
    private Funcionario funcionario;

    public ContratoHora(Integer numMeses, String dataInicio, Boolean registro, Cargo cargo, Integer horaMes, Double valorHora, Funcionario funcionario) {
        super(numMeses, dataInicio, registro, cargo);
        this.horaMes = horaMes;
        this.valorHora = valorHora;
        this.funcionario = funcionario;
    }

    public Integer getHoraMes() {
        return horaMes;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setHoraMes(Integer horaMes) {
        this.horaMes = horaMes;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Horista -" +
                " Horas contratadas: " + horaMes +
                " | Valor hora: " + valorHora + " | " + funcionario;
    }

    @Override
    public int compareTo(ContratoHora o) {
        if (this.horaMes > o.horaMes) return 1;
        if (this.horaMes < o.horaMes) return -1;
        return 0;
    }
}
