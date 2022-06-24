public class Cliente {
    private String nome;
    private String sobrenome;
    private double dividaEmConta;
    private double limite;
    private String rg;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.limite= limite;
        this.rg = rg;
        dividaEmConta = 0;

    }
    public void comprar(double valor) throws LimiteException {
        if (valor > limite) {
            throw new LimiteException();
        }

        dividaEmConta += valor;
    }
    public void pagarDivida(double valor) throws DividaException {
        if (dividaEmConta <= 0) {
            throw new DividaException();
        }

        dividaEmConta -= valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", sua divida é=" + dividaEmConta + "R$ }";
    }
}