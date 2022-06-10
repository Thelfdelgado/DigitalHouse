package Checkpoint;

public abstract class Veiculo{
    private String categoria;
    private String modelo;
    private String placa;
    private double kmRodado;
    protected double valorAluguel;
    private double taxaSeguro;
    private boolean disponivel;

    public Veiculo(
            String categoria,
            String modelo,
            String placa,
            double kmRodado,
            double valorAluguel,
            double taxaSeguro,
            boolean disponivel
    ) {
        this.categoria = categoria;
        this.modelo = modelo;
        this.placa = placa;
        this.kmRodado = kmRodado;
        this.valorAluguel = valorAluguel;
        this.taxaSeguro = taxaSeguro = 5;
        this.disponivel = false;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public abstract void valorFinal();

    public double getTaxaSeguro() {
        return taxaSeguro;
    }
}
