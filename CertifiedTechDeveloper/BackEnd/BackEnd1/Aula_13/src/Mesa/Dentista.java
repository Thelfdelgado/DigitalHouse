package Mesa;

public class Dentista {
    private Integer id;
    private String sobrenome;
    private String nome;
    private String matricula;

    public Dentista(Integer id, String sobrenome, String nome, String matricula) {
        this.id = id;
        this.sobrenome = sobrenome;
        this.nome = nome;
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String setMatricula(String matricula) {
        this.matricula = matricula;
        return matricula;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "sobrenome='" + sobrenome + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
