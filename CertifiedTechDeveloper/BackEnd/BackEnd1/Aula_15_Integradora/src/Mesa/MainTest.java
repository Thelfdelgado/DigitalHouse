package Mesa;

import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    PacienteService pacienteService;
    EnderecoService enderecoService;

    @BeforeEach
    void doBefore(){
        enderecoService = new EnderecoService(new EnderecoDaoH2(new ConfigJDBC()));
        pacienteService = new PacienteService(new PacienteDaoH2(new ConfigJDBC()));
    }

    @Test
    public void test(){
        Endereco endereco = new Endereco("rua1", 123, "cidade1", "bairro1");
        enderecoService.cadastro(endereco);
        assertTrue(endereco.getIdEndereco()!=null);

        System.out.println("ID do endereco: " + endereco.getIdEndereco());

        enderecoService.buscar(1);

        Paciente paciente = new Paciente("Luiz", "Delgado", "12312311","11/11/2022",endereco.getIdEndereco());
        pacienteService.cadastro(paciente);
        assertTrue(paciente.getIdPaciente()!=null);

        System.out.println("ID do paciente: " + paciente.getIdPaciente());

        pacienteService.buscar(1);
        pacienteService.excluir(1);
        pacienteService.buscar(1);
    }

}
