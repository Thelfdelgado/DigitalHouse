import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExameException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma mensagem bonita!");
        String mensagemBonita = scanner.nextLine();

        OnibusLinha motorista1 = new OnibusLinha(
                "Luiz",
                "Delgado",
                "E",
                123213,
                10,
                true,
                3,
                "Noturno");

        //Exception
        OnibusViagem motorista2 = new OnibusViagem(
                "Luiz1",
                "Delgado1",
                "D",
                123123,
                5,
                false,
                15,
                9);

        Empresa empresa = new Empresa();
        empresa.addMotorista(motorista1);
        motorista1.validadeExame();
        empresa.addMotorista(motorista2);
        motorista2.validadeExame();

        Iterator<Motorista> motoInterator = empresa.getMotoristas().iterator();
        while ( motoInterator.hasNext()) {
            System.out.println(motoInterator.next());
        }

        motorista1.calcularDiasTrabalhados();
        motorista2.calcularDiasTrabalhados();

    }
}
