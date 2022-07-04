public abstract class Consulta {
    private Paciente paciente;
    private String dataConsulta, especialidade, horaMinuto;
    private Boolean primeiraConsulta;

    public Consulta(Paciente paciente, String dataConsulta, String especialidade, String horaMinuto, Boolean primeiraConsulta) {
        this.paciente = paciente;
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.horaMinuto = horaMinuto;
        this.primeiraConsulta = primeiraConsulta;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getHoraMinuto() {
        return horaMinuto;
    }

    public Boolean getPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setHoraMinuto(String horaMinuto) {
        this.horaMinuto = horaMinuto;
    }

    public void setPrimeiraConsulta(Boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

    public void temHistorico() {
        if (this.primeiraConsulta.equals(true)) {
            System.out.println("Paciente nao tem historico!");
        } else {
            System.out.println("Paciente tem historico!");
        }
    }

    @Override
    public String toString() {
        return "Consulta" + ("\n") +
                "Paciente - " + paciente + ("\n") +
                "Data da consulta: " + dataConsulta + ("\n") +
                "Especialidade: " + especialidade + ("\n") +
                "Hora: " + horaMinuto + ("\n") +
                "Primeira consulta: " + primeiraConsulta;
    }
}
