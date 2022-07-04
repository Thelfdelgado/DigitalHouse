public class OnibusViagem extends Motorista {
    private Integer folgasMes, numViagens;

    public OnibusViagem(String nome) {
        super(nome);
    }

    public OnibusViagem(String nome, String sobrenome, String cnh, Integer numCnh, Integer numOnibusDirigidos, Boolean exame, Integer folgasMes, Integer numViagens) {
        super(nome, sobrenome, cnh, numCnh, numOnibusDirigidos, exame);
        this.folgasMes = folgasMes;
        this.numViagens = numViagens;
    }

    public Integer getFolgasMes() {
        return folgasMes;
    }

    public void setFolgasMes(Integer folgasMes) {
        this.folgasMes = folgasMes;
    }

    public Integer getNumViagens() {
        return numViagens;
    }

    public void setNumViagens(Integer numViagens) {
        this.numViagens = numViagens;
    }

    @Override
    public Integer calcularDiasTrabalhados() {
        return 30 - folgasMes;
    }

    @Override
    public String toString() {
        return "Onibus de Viagem - " + getNome() + " " + getSobrenome() + ("\n") +
                "Folgas no Mes: " + folgasMes + ("\n") +
                "Numero de Viagens: " + numViagens;
    }
}
