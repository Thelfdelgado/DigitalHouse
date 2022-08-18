package Mesa;

import java.time.LocalDate;

public class Hotel {
    private String cidade;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Hotel(String cidade, LocalDate dataEntrada, LocalDate dataSaida) {
        this.cidade = cidade;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "BuscaHotel{" +
                "dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
