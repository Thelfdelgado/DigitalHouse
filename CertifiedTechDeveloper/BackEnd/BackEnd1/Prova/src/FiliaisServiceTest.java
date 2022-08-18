import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiliaisServiceTest {
    private static final Logger logger = Logger.getLogger(FiliaisServiceTest.class);

    FiliaisService filiaisService;

    @BeforeEach
    void doBefore() {
        filiaisService = new FiliaisService(new FiliaisDaoH2(new ConfigJDBC()));
    }

    @Test
    public void testSalvar(){
        BasicConfigurator.configure();

        Filiais f1 = new Filiais(1,"Dunder Mifflin", "Slough Road", 1728, "Scranton", "Pennsylvania", true);
        filiaisService.salvar(f1);
        assertTrue(f1.getId()!=null);

        Filiais f2 = new Filiais(2,"Filial 2", "Guarana", 178, "Antartica", "RJ", true);
        filiaisService.salvar(f2);
        assertTrue(f2.getId()!=null);

        Filiais f3 = new Filiais(3,"Filial 3", "Coca", 17, "Cola", "SP", true);
        filiaisService.salvar(f3);
        assertTrue(f3.getId()!=null);

        Filiais f4 = new Filiais(4,"Filial 4", "Dolly", 28, "Guarana", "MG", false);
        filiaisService.salvar(f4);
        assertTrue(f4.getId()!=null);

        Filiais f5 = new Filiais(5,"Filial 5", "Calendario", 72, "Cadeira", "RJ", false);
        filiaisService.salvar(f5);
        assertTrue(f5.getId()!=null);
    }
}