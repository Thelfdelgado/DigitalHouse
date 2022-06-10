package Checkpoint;

class main {
    public static void main(String[] args) {
        Veiculo carro = new Carro(
                "Carro",
                "Volkswagen Gol",
                "ABC-1234",
                100000,
                1000,
                500,
                true
        );
        carro.valorFinal();

        Veiculo moto = new Moto(
                "Moto",
                "Honda CG 160 Fan",
                "CBA-4321",
                50000,
                700,
                300,
                false
        );
        moto.valorFinal();

        Veiculo onibus = new Onibus(
                "Ônibus",
                "Mercedes-Benz OF 1519 R",
                "ACB-1423",
                150000,
                2000,
                1000,
                true
        );
        onibus.valorFinal();
    }
}