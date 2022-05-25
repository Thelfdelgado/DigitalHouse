import java.util.Scanner;

public class nuPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é Primo: ");
        int x = scanner.nextInt();

        if (ePrimo(x)) {
            System.out.println("O número " + x + " é Primo!");
        }else {
            System.out.println("O número " + x + " não é Primo!");
        };

        System.out.println("Digite três números (A,B,C) e descubra qual o maior!");
        System.out.println("Insira o número A: ");
        int a = scanner.nextInt();
        System.out.println("Insira o número B: ");
        int b = scanner.nextInt();
        System.out.println("Insira o número C: ");
        int c = scanner.nextInt();

        int maior = maiorDosTres(a, b, c);

        if (maior == a) {
            System.out.println("O Maior número informado é: " + a);
        }
        if (maior == b) {
            System.out.println("O Maior número informado é: " + b);
        }
        if (maior == c) {
            System.out.println("O Maior número informado é: " + c);
        }
    }

    public static Boolean eDivisivel(int x, int y) {
        if (x%y == 0) {
            return true;
        }else {
            return false;
        }
    };

    public static Boolean ePrimo(int x) {
        if (x == 2 || x == 3 || x == 5) {
            return true;
        };
        if(eDivisivel(x,2) || eDivisivel(x,3) || eDivisivel(x, 5)) {
            return false;
        }else {
            return true;
        }
    };

    public static Integer maiorDosTres(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= a && b >= c) {
            return b;
        }
        return c;
    }
}

