package Aula1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {
    Pessoa p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore(){
        p1 = new Pessoa("Luiz","Delgado");
        p1.setIdade(LocalDate.of(1998, 5, 7));
        p2 = new Pessoa("Luz","Delgado1");
        p2.setIdade(LocalDate.of(1990, 5, 7));
        p3 = new Pessoa("Luiz2","Delgado2");
        p3.setIdade(LocalDate.of(1994, 5, 7));
        p4 = new Pessoa("Luiz3","Delgado3");
        p4.setIdade(LocalDate.of(1995, 5, 7));
        p5 = new Pessoa("Luiz4","Delgado4");
        p5.setIdade(LocalDate.of(2018, 5, 7));
        p6 = new Pessoa("Luiz5","Delgado5");
        p6.setIdade(LocalDate.of(2014, 5, 7));
        p7 = new Pessoa("Luiz6","Delgado6");
        p7.setIdade(LocalDate.of(1978, 5, 7));
        p8 = new Pessoa("Luiz7","Delgado7");
        p8.setIdade(LocalDate.of(2010, 5, 7));
        p9 = new Pessoa("Luiz8","Delgado8");
        p9.setIdade(LocalDate.of(2009, 5, 7));
        p10 = new Pessoa("Lui","Delgado9");
        p10.setIdade(LocalDate.of(1970, 5, 7));
    }

    @Test
    void imprimirObjetos(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void adicionarColecao(){
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p2);
        p3.adicionarNomes(p3);
        p4.adicionarNomes(p4);
        p5.adicionarNomes(p5);
        p6.adicionarNomes(p6);
        p7.adicionarNomes(p7);
        p8.adicionarNomes(p8);
        p9.adicionarNomes(p9);
        p10.adicionarNomes(p10);
    }
}
