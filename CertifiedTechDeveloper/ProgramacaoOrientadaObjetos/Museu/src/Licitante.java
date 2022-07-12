public class Licitante implements Observador{
    private String nome, sobrenome;
    private int rg;
    private final double valorMaximo;
    private double lance;

    public Licitante(String nome, String sobrenome, int rg, double valorMaximo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.valorMaximo = valorMaximo;
        this.lance = lance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    public double getLance() {
        return lance;
    }

    public void setLance(double lance) {
        this.lance = lance;
    }

    @Override
    public void receberNotificacao(double valor) {
        lance++;
        if (getLance() < valor) {
            System.out.println(getNome() + " fez um lance de " + getLance() + " que nao condiz com o valor minimo.");
        }
    }

    public void darLance() {
        receberNotificacao();
    }
}