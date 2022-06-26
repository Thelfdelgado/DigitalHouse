public class Funcionario {
    private String nome, sobrenome;
    private Integer rg, idade;

    public Funcionario(String nome, String sobrenome, Integer rg, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getRg() {
        return rg;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " | Sobrenome: " + sobrenome +
                " | RG: " + rg +
                " | Idade: " + idade;
    }
}
