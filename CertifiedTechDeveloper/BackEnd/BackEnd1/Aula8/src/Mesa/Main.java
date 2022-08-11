package Mesa;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Voo v1 = new Voo("RJ", LocalDate.of(2022,12,23), LocalDate.of(2023,5,20));
        Voo v2 = new Voo("SP", LocalDate.of(2022,12,12), LocalDate.of(2023,4,25));
        Hotel h1 = new Hotel("RJ", LocalDate.of(2022,12,23), LocalDate.of(2023,5,20));
        Hotel h2 = new Hotel("SP", LocalDate.of(2022,12,12), LocalDate.of(2023,4,25));

        IBuscaFacade buscaFacade = new BuscaFacade(new ApiVoo(Arrays.asList(v1, v2)), new ApiHotel(Arrays.asList(h1, h2)));

        buscaFacade.busca(v1, h1);
    }
}
