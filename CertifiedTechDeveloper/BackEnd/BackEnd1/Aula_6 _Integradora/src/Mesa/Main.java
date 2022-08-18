package Mesa;

public class Main {
    public static void main(String[] args) {
        Serie s1 = new Serie("Breaking_Bad");
        Serie s2 = new Serie("Peaky_Blinders");
        Serie s3 = new Serie("The_Office");
        Serie s4 = new Serie("The_Boys");

        ISerie series = new SerieProxy();

        try {
            series.getSerie(s1.toString());
            series.getSerie(s2.toString());
            series.getSerie(s3.toString());
            series.getSerie(s4.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
