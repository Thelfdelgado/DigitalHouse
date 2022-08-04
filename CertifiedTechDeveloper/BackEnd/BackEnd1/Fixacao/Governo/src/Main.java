public class Main {
    public static void main(String[] args) {
        Documentos handlerBase = new Deputado().setSeguinteFuncionario(new Ministro().setSeguinteFuncionario(new Presidente()));

        handlerBase.processarTipo(1);
    }
}
