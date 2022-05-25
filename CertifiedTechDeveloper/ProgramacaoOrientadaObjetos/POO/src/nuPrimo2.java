import java.util.Scanner;

public class nuPrimo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de numeros primos que deseja ver: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i <= quantidade; i++) {
            if (ehprimo(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean ehprimo(int numero) {
        boolean primo = true;
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}