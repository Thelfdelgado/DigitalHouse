package Aula;

import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MedicamentoServiceTest {
    MedicamentoService medicamentoService;

    @BeforeEach
    void doBefore(){
        medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void guardarMedicamento(){
        BasicConfigurator.configure();

        Medicamento medicamento = new Medicamento(1,"Ibuprofeno", "Aché",395,23.0);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId()!=null);
    }
}
