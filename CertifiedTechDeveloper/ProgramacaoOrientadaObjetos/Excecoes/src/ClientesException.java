public class ClientesException extends Exception{
    public ClientesException() {
        super();
    }

    public ClientesException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String toString() {
        return "CientesException: " + super.toString();
    }
}
