public class Deputado extends Documentos{
    @Override
    public void processarTipo(Integer tipo) {
        if (tipo < 2)
            System.out.println("Deputado");
        else if (this.seguinteFuncionario != null) {
            this.seguinteFuncionario.processarTipo(tipo);
        }
    }
}
