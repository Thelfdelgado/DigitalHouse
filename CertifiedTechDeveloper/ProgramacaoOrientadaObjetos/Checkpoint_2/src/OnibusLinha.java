import java.util.Scanner;

public class OnibusLinha extends Motorista {
    Scanner scanner = new Scanner(System.in);
    private Integer folgasSemana;
    private String turno;

    public OnibusLinha(String nome) {
        super(nome);
    }

    public OnibusLinha(String nome, String sobrenome, String cnh, Integer numCnh, Integer numOnibusDirigidos, Boolean exame, Integer folgasSemana, String turno) {
        super(nome, sobrenome, cnh, numCnh, numOnibusDirigidos, exame);
        this.folgasSemana = folgasSemana;
        this.turno = turno;
    }

    public Integer getFolgasSemana() {
        return folgasSemana;
    }

    public void setFolgasSemana(Integer folgasSemana) {
        this.folgasSemana = folgasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public Integer calcularDiasTrabalhados() {
        return 30 - (folgasSemana*4);
    }

    @Override
    public String toString() {
        return "Onibus de Linha - " + getNome() + " " + getSobrenome() + ("\n") +
                "Folgas na Semana: " + folgasSemana + ("\n") +
                "Turno: " + turno;
    }
}
