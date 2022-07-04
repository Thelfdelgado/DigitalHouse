import java.util.Date;

public abstract class Contrato {
    private final Integer numMeses;
    private final Date dataInicio;
    private Funcionario funcionario;


    public Contrato(Integer numMeses, Date dataInicio, Funcionario funcionario) {
        this.numMeses = numMeses;
        this.dataInicio = dataInicio;
        this.funcionario = funcionario;
    }

    public Integer getNumMeses() {
        return numMeses;
    }

    public Date getDataInicio() {
        return dataInicio;
    }
}