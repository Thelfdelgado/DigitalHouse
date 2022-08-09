public class Circulo {
    private String cor;
    private int raio;
    private String tamanho;

    public Circulo(String cor) {
        this.cor = cor;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void desenhar(){
        System.out.printf("Desenhamos um objeto da cor: " + cor);
    }
}
