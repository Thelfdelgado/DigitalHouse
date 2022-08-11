package Aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {
    @Test
    void getTriangulo(){
        Triangulo triangulo = FlyweightFactory.obterTriangulo("Vermelho");
        triangulo.setTamanho(2);
        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("Preto");
        triangulo1.setTamanho(4);

        assertEquals("Vermelho", triangulo.getCor());
        assertEquals(4, triangulo1.getTamanho());
        assertEquals(FlyweightFactory.trianguloMap.size() == 1, true);
    }

}