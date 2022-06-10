package Aulas;

import java.util.Random;
import java.util.Scanner;

public class joKenPo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random computer = new Random();

        System.out.println("Pedra (0) | Papel (1) | Tesoura (2)");
        int player = scanner.nextInt();
        int pc = computer.nextInt(3);

    }
}

//    String jo = "Pedra";
//    String ken = "Papel";
//    String po = "Tesoura";