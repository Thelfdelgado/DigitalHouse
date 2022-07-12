public abstract class Trem {
    private String nome;

    public Trem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularArea();
}