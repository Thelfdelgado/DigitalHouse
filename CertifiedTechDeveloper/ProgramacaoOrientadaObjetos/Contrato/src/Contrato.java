import java.util.Objects;

public abstract class Contrato {
    private Integer numMeses;
    private String dataInicio;
    private Boolean registro;
    private Cargo cargo;

    public Contrato(Integer numMeses, String dataInicio, Boolean registro, Cargo cargo) {
        this.numMeses = numMeses;
        this.dataInicio = dataInicio;
        this.registro = registro;
        this.cargo = cargo;
    }

    public Integer getNumMeses() {
        return numMeses;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setNumMeses(Integer numMeses) {
        this.numMeses = numMeses;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Boolean getRegistro() {
        return registro;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setRegistro(Boolean registro) {
        this.registro = registro;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Contrato" + ("\n") +
                "Num Meses: " + numMeses + ("\n") +
                "Data de inicio: " + dataInicio;
    }

    public void regMt() throws RegistroException {
        if (this.registro.equals(false)) {
            throw new RegistroException();
        } else {
            System.out.println("Registrado no MT");
        }
    }
}