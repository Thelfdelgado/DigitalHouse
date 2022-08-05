package Mesa;

public class SerieProxy implements ISerie{
    private int qtdViews = 0;

    public void contadorViews(){
        qtdViews++;
    }

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException{
        if (qtdViews < 6){
            Serie serie = new Serie(nome);
            serie.getSerie(nome);
            contadorViews();
            System.out.println(nome);
        }else {
            throw new SerieNaoHabilitadaException();
        }
        return null;
    }
}
