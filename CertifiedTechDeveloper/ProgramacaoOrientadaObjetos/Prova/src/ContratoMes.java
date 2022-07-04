import java.util.Date;

public class ContratoMes extends Contrato{

    private Double salarioMes;
    private Integer totalHora;
    private Cargo cargo;


    public ContratoMes(Integer numMeses, Date dataInicio, Boolean registro, Double salarioMes, Integer totalHora, Cargo cargo) {
        super(numMeses, dataInicio, registro);
        this.salarioMes = salarioMes;
        this.totalHora = totalHora;
        this.cargo = cargo;
    }
}
