public class Main {
    public static void main(String[] args) {
        Particular rico = new Particular(
                new Paciente("Luiz",
                        "Delgado",
                        "07/05/1998"),
                "27/06/2022",
                "Oftalmologista",
                "14h30",
                true,
                250.0,
                12345678);
        Publico quebrado = new Publico(
                new Paciente("Maju",
                        "Lopes",
                        "18/03/2002"),
                "28/06/2022",
                "Psicologo",
                "16h00",
                false,
                1233455678);

        rico.temHistorico();
        System.out.println(rico);

        quebrado.temHistorico();
        System.out.println(quebrado);
    }
}
