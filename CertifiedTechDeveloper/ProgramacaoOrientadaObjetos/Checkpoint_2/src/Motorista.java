import java.util.Objects;

public abstract class Motorista implements Comparable<Motorista> {
    private String nome;
    private String sobrenome;
    private String cnh;
    private Integer numCnh, numOnibusDirigidos;
    private Boolean exame;

    public Motorista(String nome) {
        this.nome = nome;
    }

    public Motorista(String nome, String sobrenome, String cnh, Integer numCnh, Integer numOnibusDirigidos, Boolean exame) {
        this(nome);
        this.sobrenome = sobrenome;
        this.cnh = cnh;
        this.numCnh = numCnh;
        this.exame = exame;
        this.numOnibusDirigidos = numOnibusDirigidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Integer getNumCnh() {
        return numCnh;
    }

    public void setNumCnh(Integer numCnh) {
        this.numCnh = numCnh;
    }

    public Boolean getExame() {
        return exame;
    }

    public void setExame(Boolean exame) {
        this.exame = exame;
    }

    public Integer getNumOnibusDirigidos() {
        return numOnibusDirigidos;
    }

    public void setNumOnibusDirigidos(Integer numOnibusDirigidos) {
        this.numOnibusDirigidos = numOnibusDirigidos;
    }

    @Override
    public boolean equals(Object obj) {
        return numOnibusDirigidos == ((Motorista) obj).numOnibusDirigidos && Objects.equals(nome, ((Motorista) obj).nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numOnibusDirigidos);
    }

    @Override
    public int compareTo(Motorista o) {
        if (numOnibusDirigidos > o.numOnibusDirigidos) return 1;
        if (numOnibusDirigidos < o.numOnibusDirigidos) return -1;
        return 0;
    }

    // Exception personalizada
    public void validadeExame() throws ExameException {
        if (this.exame.equals(false)) {
            throw new ExameException();
        } else {
            System.out.println("Exame em dia!");
        }
    }

    // Todos os meses tem 30 dias
    public abstract Integer calcularDiasTrabalhados();

    @Override
    public String toString() {
        return "Motorista - " + ("\n") +
                "Nome: " + nome + ("\n") +
                "Sobrenome: '" + sobrenome + ("\n") +
                "CNH: " + cnh + ("\n") +
                "Numero da CNH: " + numCnh + ("\n") +
                "Exame: " + exame;
    }
}
