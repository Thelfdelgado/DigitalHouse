package Mesa;

import java.time.LocalDate;

public class Voo {
    private String destino;
    private String origem;
    private LocalDate dataPartida;
    private LocalDate dataRetorno;

    public Voo(String destino, LocalDate dataPartida, LocalDate dataRetorno) {
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDate getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(LocalDate dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "BuscaVoo{" +
                "destino='" + destino + '\'' +
                ", origem='" + origem + '\'' +
                ", dataPartida=" + dataPartida +
                ", dataRetorno=" + dataRetorno +
                '}';
    }
}
