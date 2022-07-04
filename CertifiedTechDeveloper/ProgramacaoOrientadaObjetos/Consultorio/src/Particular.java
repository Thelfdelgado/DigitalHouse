public class Particular extends Consulta{
    private Double valorConsulta;
    private Integer rg;

    public Particular(Paciente paciente, String dataConsulta, String especialidade, String horaMinuto, Boolean primeiraConsulta, Double valorConsulta, Integer rg) {
        super(paciente, dataConsulta, especialidade, horaMinuto, primeiraConsulta);
        this.valorConsulta = valorConsulta;
        this.rg = rg;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public Integer getRg() {
        return rg;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Particular - " + getPaciente() + ("\n") +
                "Valor da consulta: " + valorConsulta + ("\n") +
                "RG: " + rg;
    }
}
