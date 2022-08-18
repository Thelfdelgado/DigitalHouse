public class Filiais {
    private Integer id;
    private String nomeFilial;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private boolean cincoEstrelas;

    public Filiais(Integer id, String nomeFilial, String rua, Integer numero, String cidade, String estado, boolean cincoEstrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isCincoEstrelas() {
        return cincoEstrelas;
    }

    public void setCincoEstrelas(boolean cincoEstrelas) {
        this.cincoEstrelas = cincoEstrelas;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Nome: " + nomeFilial + "\n" +
                "Endereço: " + rua + ", " + numero + " " + cidade + " - " + estado + "\n" +
                "Cinco Estrelas: " + cincoEstrelas + "\n" +
                " ";
    }
}
