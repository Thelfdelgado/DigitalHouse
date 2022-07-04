public class Paciente {
    private String nome, sobrenome, dataNascimento;

    public Paciente(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return getNome() +("\n") +
                "Nome: " + nome + ("\n") +
                "Sobrenome: " + sobrenome + ("\n") +
                "Data de nascimento: " + dataNascimento;
    }
}
