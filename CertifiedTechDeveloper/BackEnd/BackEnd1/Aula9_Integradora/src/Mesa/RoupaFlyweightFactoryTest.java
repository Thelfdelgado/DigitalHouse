package Mesa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoupaFlyweightFactoryTest {
    @Test
    void getRoupas(){
        Roupa roupa1 = RoupaFlyweightFactory.obterRoupa(new Roupa("S", true, true));
        Roupa roupa2 = RoupaFlyweightFactory.obterRoupa(new Roupa("S", true, true));
        Roupa roupa3 = RoupaFlyweightFactory.obterRoupa(new Roupa("S", true, true));
        Roupa roupa4 = RoupaFlyweightFactory.obterRoupa(new Roupa("S", true, true));
        Roupa roupa5 = RoupaFlyweightFactory.obterRoupa(new Roupa("S", true, true));

        assertEquals(roupa1.getTamanho(), "S");
        assertEquals(roupa2.iseNovo(), true);
        assertEquals(roupa3.getTamanho(), "S");
        assertEquals(roupa4.isImportada(), true);
        assertEquals(roupa5.getTamanho(), "S");
        assertEquals(1, RoupaFlyweightFactory.mapTamanho.size());
        assertEquals(1, RoupaFlyweightFactory.mapNovoImportada.size());
    }
}