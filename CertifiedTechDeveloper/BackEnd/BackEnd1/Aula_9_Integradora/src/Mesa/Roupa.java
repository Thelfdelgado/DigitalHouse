package Mesa;

public class Roupa {
    private String tamanho;
    private String tipo;
    private boolean eNovo;
    private boolean importada;

    public Roupa(String tamanho, boolean eNovo, boolean importada) {
        this.tamanho = tamanho;
        this.eNovo = eNovo;
        this.importada = importada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean iseNovo() {
        return eNovo;
    }

    public void seteNovo(boolean eNovo) {
        this.eNovo = eNovo;
    }

    public boolean isImportada() {
        return importada;
    }

    public void setImportada(boolean importada) {
        this.importada = importada;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", eNovo=" + eNovo +
                ", importada=" + importada +
                '}';
    }
}
