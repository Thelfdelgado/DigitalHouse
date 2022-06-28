public class Caixa extends Produto{
    private double comprimento, altura, largura;

    public Caixa(double peso, double comprimento, double altura, double largura) {
        super(peso);
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularEspaco() {
        return (comprimento * altura * largura);
    }
}
