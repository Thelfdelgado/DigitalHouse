package Mesa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {
    @BeforeEach
    void doBefore(){
        Quadrado quadrado = new Quadrado(4);
        Circulo circulo = new Circulo(3);

        Assertions.assertEquals(4 * quadrado.getLado(), quadrado.calcularPerimetro());
    }

    @Test
    void calcPeri() {
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(4);

        Assertions.assertEquals(2 * Math.PI * circulo.getRaio(), circulo.calcularPerimetro());
    }
}