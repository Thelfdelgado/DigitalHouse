// Atualmente, o sistema permite que os vendedores sejam classificados de acordo com o cumprimento de determinados requisitos.
// Cada vendedor retorna uma categoria (mostrarCategoria) de acordo com o número de pontos obtidos.
// Os vendedores são categorizados da seguinte forma:
// Menos de 20 pontos = novato;
// Entre 20 e 30 pontos = aprendiz;
// Entre 31 e 40 pontos = bom;
// Mais de 40 pontos = mestre.
// Deve ser implementado um método mostrarCategoria que deve primeiro calcularPontos,
// depois recategorizar de acordo com a pontuação obtida no método anterior e, finalmente, exibir o nome do vendedor,
// total de pontos e categoria por console.

public abstract class Vendedores {
    protected String nome;
    protected int vendas;
    protected int pontos;

    public Vendedores(String nome, int vendas, int pontos) {
        this.nome = nome;
        this.vendas = vendas;
        this.pontos = pontos;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String mostrarCategoria(){
        int pontosVendedor = calcularPontos();
        return "Pontos: " + pontosVendedor + " Categoria: " + nomeCategoria();
    }

    public abstract int calcularPontos();

    public String nomeCategoria(){
        if (this.pontos <= 19){
            return "Novato";
        } else if (this.pontos >= 20 && this.pontos <= 30) {
            return "Aprendiz";
        } else if (this.pontos >= 31 && this.pontos <= 40) {
            return "Bom";
        } else {
            return "Mestre";
        }
    }

    @Override
    public String toString() {
        return "Vendedores{" +
                "nome='" + nome + '\'' +
                ", vendas=" + vendas +
                ", pontos=" + pontos +
                '}';
    }
}
