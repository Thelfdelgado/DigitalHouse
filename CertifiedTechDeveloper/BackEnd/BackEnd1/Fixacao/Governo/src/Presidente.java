public class Presidente extends Documentos{

    @Override
    public void processarTipo(Integer tipo) {
        if (tipo <= 3)
            System.out.println("Presidente");
        else if (this.seguinteFuncionario != null)
            this.seguinteFuncionario.processarTipo(tipo);
    }
}
