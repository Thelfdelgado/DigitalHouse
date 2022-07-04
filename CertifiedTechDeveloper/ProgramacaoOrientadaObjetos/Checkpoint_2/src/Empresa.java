import java.util.Set;
import java.util.TreeSet;

public class Empresa {
    private String nome;
    private Set<Motorista> motoristas;

    public Empresa() {
        this.motoristas = new TreeSet<>();
    }

    public void addMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public Set<Motorista> getMotoristas() {
        return motoristas;
    }

    public String getNome() {
        return nome;
    }

    public void setMotoristas(Set<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    @Override
    public String toString() {
        return "Empresa - " + nome + ("\n") +
                "Motoristas: " + motoristas;
    }
}
