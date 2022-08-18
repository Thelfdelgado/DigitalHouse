package Aula;

import org.junit.jupiter.api.Test;

class FuncionarioTest {
    @Test
    void Calculos() {
        Funcionario funcionario = new Efetivo("Luiz", "Delgado", "123456-7", 7000.0, 200.0, 500.0);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Maju", "Lopes", "123123-2", 240, 40);
        funcionario.pagamentoSalario();
    }
}