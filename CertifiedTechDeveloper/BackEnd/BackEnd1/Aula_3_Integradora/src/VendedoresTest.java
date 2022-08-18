import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VendedoresTest {

    Funcionario f1,f2,f3,f4;
    Afiliados a1,a2,a3,a4,a5,a6,a7,a8;

    @BeforeEach
    public void doBefore() {
        f1 = new Funcionario("F1", 1);
        f1.setAnosDeCasa(LocalDate.of(2020,1,1));
        f2 = new Funcionario("F2", 4);
        f2.setAnosDeCasa(LocalDate.of(2020,1,1));
        f3 = new Funcionario("F3", 3);
        f3.setAnosDeCasa(LocalDate.of(2020,1,1));
        f4 = new Funcionario("F4", 1);
        f4.setAnosDeCasa(LocalDate.of(2020,1,1));

        a1 = new Afiliados("A1", 8);
        a2 = new Afiliados("A2", 7);
        a3 = new Afiliados("A3", 6);
        a4 = new Afiliados("A4", 5);
        a5 = new Afiliados("A5", 4);
        a6 = new Afiliados("A6", 3);
        a7 = new Afiliados("A7", 2);
        a8 = new Afiliados("A8", 1);

        f1.addAfiliados(a1);
        f1.addAfiliados(a8);
        f1.addAfiliados(a2);
        f1.addAfiliados(a7);
        f3.addAfiliados(a3);
        f3.addAfiliados(a6);
        f3.addAfiliados(a4);
        f4.addAfiliados(a5);
    }

    @Test
    public void mostrar(){
        System.out.println(f1.mostrarCategoria());
        System.out.println(f2.mostrarCategoria());
        System.out.println(f3.mostrarCategoria());
        System.out.println(f4.mostrarCategoria());
        System.out.println(a1.mostrarCategoria());
        System.out.println(a2.mostrarCategoria());
        System.out.println(a3.mostrarCategoria());
        System.out.println(a4.mostrarCategoria());
        System.out.println(a5.mostrarCategoria());
        System.out.println(a6.mostrarCategoria());
        System.out.println(a7.mostrarCategoria());
        System.out.println(a8.mostrarCategoria());
    }
}