package Mesa;

public class Tree {
    private String tipo;
    private int altura;
    private int largura;
    private String cor;

    public Tree(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void plantar(){
        System.out.println("Plantamos uma arvore do tipo: " + tipo);
    }
}
