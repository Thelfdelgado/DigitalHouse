import java.time.LocalDate;
import java.time.Period;

public abstract class Card {
    private int cardNum;
    private int cod;
    LocalDate dataValidade;

    public Card(int cardNum, int cod, LocalDate dataValidade) {
        this.cardNum = cardNum;
        this.cod = cod;
        this.dataValidade = dataValidade;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public abstract double autorizado();

    public int DataValidade(){
        return Period.between(this.dataValidade, LocalDate.of(2024,1,1)).getYears();
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNum=" + cardNum +
                ", cod=" + cod +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
