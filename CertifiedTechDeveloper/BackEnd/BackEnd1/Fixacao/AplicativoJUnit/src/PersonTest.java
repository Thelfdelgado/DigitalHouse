import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void noCompleto(){
        Person luiz = new Person("Luiz", "Delgado", "luiz@email.com", 24);
        Person maia = new Person("Maia", "Delgado", "maia@email.com", 2);

        Assertions.assertEquals(luiz.getSobrenome() + " " + luiz.getNome(), luiz.nomeCompleto());
    }
    @Test
    void seEMaior(){
        Person luiz = new Person("Luiz", "Delgado", "luiz@email.com", 24);
        Person maia = new Person("Maia", "Delgado", "maia@email.com", 2);

        boolean deMaior = maia.deMaior();

        assertEquals(true, luiz.deMaior());
        assertFalse(deMaior);
    }
}
