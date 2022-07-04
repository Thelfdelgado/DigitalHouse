import java.util.Date;

public class ContratoHora extends Contrato implements Comparable<ContratoHora>{

    private Integer horaMes;
    private Double valorHora;

    public ContratoHora(Integer numMeses, Date dataInicio, Funcionario funcionario) {
        super(numMeses, dataInicio, funcionario);
    }


    @Override
    public Date getDataInicio() {
        return super.getDataInicio();
    }

    public Double getValorHora() {
        return valorHora;
    }

    @Override
    public Integer getNumMeses() {
        return super.getNumMeses();
    }

    public Integer getHoraMes() {
        return horaMes;
    }

    @Override
    public int compareTo(ContratoHora o) {
        if (this.horaMes > o.horaMes) return 1;
        if (this.horaMes < o.horaMes) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "ContratoHora{" +
                "horaMes=" + horaMes +
                ", valorHora=" + valorHora +
                '}';
    }
}
