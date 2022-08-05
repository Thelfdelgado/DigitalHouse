package Aula;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class PessoaTest {
    Date data = new Date();

    @Test
    public void vacinar(){
        Pessoa p1 = new Pessoa("p1", "pp1", "123123", data,"Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();

        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }
}
