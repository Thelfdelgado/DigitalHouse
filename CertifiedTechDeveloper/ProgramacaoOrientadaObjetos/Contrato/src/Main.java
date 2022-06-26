public class Main {
    public static void main(String[] args) {

        ContratoHora horista = new ContratoHora(
                5,
                "19/05/2021",
                true,
                Cargo.FUNCIONARIO,
                500,
                7.0,
                new Funcionario("Luiz", "Delgado", 12345678, 24)
        );

        ContratoMes mensal = new ContratoMes(
                10,
                "01/09/2020",
                true,
                Cargo.CHEFE,
                5000.0,
                500,
                new Funcionario("Luiz2", "Delgado2", 56756756, 98)
        );

        System.out.println(horista);
        try {
            horista.regMt();
        } catch (RegistroException e) {
            throw new RuntimeException(e);
        }

        System.out.println(mensal);
        try {
            mensal.regMt();
        } catch (RegistroException e) {
            throw new RuntimeException(e);
        }
        mensal.isBoss();

    }
}
