package Checkpoint;

public class Carro extends Veiculo{
    public Carro(
            String categoria,
            String modelo,
            String placa,
            double kmRodado,
            double valorAluguel,
            double taxaSeguro,
            boolean disponivel
    ) {
        super(categoria, modelo, placa, kmRodado, valorAluguel,taxaSeguro, disponivel);
    }

    @Override
    public void setDisponivel(boolean disponivel) {
        super.setDisponivel(disponivel);
    }

    @Override
    public void valorFinal() {
        System.out.println("Valor final: " + (getTaxaSeguro() + valorAluguel));
    }
}