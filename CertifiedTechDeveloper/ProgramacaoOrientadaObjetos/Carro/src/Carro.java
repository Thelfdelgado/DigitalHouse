public class Carro {
    private boolean freioAcionado = false;
    private Estado estado = new Desligado(this);

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFreioAcionado(boolean freioAcionado) {
        this.freioAcionado = freioAcionado;
    }

    public boolean getFreioAcionado() {
        return freioAcionado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void apertarBotao() {

    }
}
