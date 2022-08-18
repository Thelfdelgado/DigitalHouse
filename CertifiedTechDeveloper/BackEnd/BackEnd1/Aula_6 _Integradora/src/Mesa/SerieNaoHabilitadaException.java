package Mesa;

public class SerieNaoHabilitadaException extends Exception{
    public SerieNaoHabilitadaException(){
        super("Excedido o numero de reproducoes permitida");
    }
}
