import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario f1,f2,f3,f4;
        Afiliados a1,a2,a3,a4,a5,a6,a7,a8;

        f1 = new Funcionario("F1", 2);
        f1.setAnosDeCasa(LocalDate.of(2001,1,1));
        f2 = new Funcionario("F2", 5);
        f2.setAnosDeCasa(LocalDate.of(2005,1,1));
        f3 = new Funcionario("F3", 6);
        f3.setAnosDeCasa(LocalDate.of(2010,1,1));
        f4 = new Funcionario("F4", 8);
        f4.setAnosDeCasa(LocalDate.of(2015,1,1));

        a1 = new Afiliados("A1", 5);
        a2 = new Afiliados("A2", 6);
        a3 = new Afiliados("A3", 7);
        a4 = new Afiliados("A4", 8);
        a5 = new Afiliados("A5", 9);
        a6 = new Afiliados("A6", 0);
        a7 = new Afiliados("A7", 1);
        a8 = new Afiliados("A8", 2);

        f1.addAfiliados(a1);
        f1.addAfiliados(a8);
        f2.addAfiliados(a2);
        f2.addAfiliados(a7);
        f3.addAfiliados(a3);
        f3.addAfiliados(a6);
        f4.addAfiliados(a4);
        f4.addAfiliados(a5);

        System.out.println(f1.mostrarCategoria());
    }
}
