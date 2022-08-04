public class Ministro extends Documentos{

    @Override
    public void processarTipo(Integer tipo) {
        if (tipo < 3)
            System.out.println("Ministro");
        else if (this.seguinteFuncionario != null)
            this.seguinteFuncionario.processarTipo(tipo);
    }
}
