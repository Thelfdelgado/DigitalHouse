public class Publico extends Consulta implements Comparable<Publico>{
    private Integer numSus;

    public Publico(Paciente paciente, String dataConsulta, String especialidade, String horaMinuto, Boolean primeiraConsulta, Integer numSus) {
        super(paciente, dataConsulta, especialidade, horaMinuto, primeiraConsulta);
        this.numSus = numSus;
    }


    public Integer getNumSus() {
        return numSus;
    }

    public void setNumSus(Integer numSus) {
        this.numSus = numSus;
    }

    @Override
    public int compareTo(Publico o) {
        if (this.numSus > o.numSus) return 1;
        if (this.numSus < o.numSus) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Publico - " + getPaciente() + ("\n") +
                "SUS: " + numSus;
    }
}
