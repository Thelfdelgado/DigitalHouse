package Aula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeDescontoTest {

    private FacadeDesconto facadeDesconto = new FacadeDesconto();
    private Cartao cartao;
    private Produto produto;

    @BeforeEach
    void doBefore(){
        cartao = new Cartao("1234567891234567", "Star Bank");
        produto = new Produto("Ervilha", "Lata");
    }

    @Test
    void validarDescontoBancoTest(){
        produto.setTipo("Enlatado");
        int desconto = facadeDesconto.desconto(cartao, produto, 1);
        assertEquals(20, desconto);
    }

    @Test
    void validarDespontoProdutoTest(){
        cartao.setBanco("Box");
        int desconto = facadeDesconto.desconto(cartao, produto, 1);
        assertEquals(10, desconto);
    }

    @Test
    void ValidarDescontoQuantidadeTest(){
        produto.setTipo("Enlatado");
        cartao.setBanco("Box");
        int desconto = facadeDesconto.desconto(cartao, produto, 12);
        assertEquals(15, desconto);
    }

    @Test
    void validarDescontoTotalTest(){
        int desconto = facadeDesconto.desconto(cartao, produto, 12);
        assertEquals(45, desconto);
    }
}