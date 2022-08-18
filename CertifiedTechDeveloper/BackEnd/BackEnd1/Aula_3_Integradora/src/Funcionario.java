// Tanto funcionários quanto afiliados são vendedores;
// O objetivo dos funcionários é conseguir afiliados (obterAfiliado) e realizar vendas (vender).
// Cada um recebe 10 pontos por cada novo afiliado, 5 pontos por cada venda que fizer e 5 pontos
// por cada ano de antiguidade que tiver.

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Funcionario extends Vendedores{
    LocalDate anosDeCasa;
    ArrayList<Vendedores> afiliados = new ArrayList<>();

    public Funcionario(String nome, int vendas) {
        super(nome, vendas, 5);
    }

    public void addAfiliados(Vendedores afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome + " afiliado de: " + super.nome);
    }

    public LocalDate getAnosDeCasa() {
        return anosDeCasa;
    }

    public void setAnosDeCasa(LocalDate anosDeCasa) {
        this.anosDeCasa = anosDeCasa;
    }

    public ArrayList<Vendedores> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(ArrayList<Vendedores> afiliados) {
        this.afiliados = afiliados;
    }

    public int antiguidade(){
        return Period.between(this.anosDeCasa, LocalDate.of(2023,1,1)).getYears();
    }

    @Override
    public int calcularPontos() {
        return pontos = (this.afiliados.size() * 10) + (antiguidade() * 5) + (this.vendas * pontos);
    }
}
