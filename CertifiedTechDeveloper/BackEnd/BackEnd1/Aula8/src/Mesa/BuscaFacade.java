package Mesa;

public class BuscaFacade implements IBuscaFacade{
    private ApiVoo apiVoo;
    private ApiHotel apiHotel;

    public BuscaFacade(ApiVoo apiVoo, ApiHotel apiHotel) {
        this.apiVoo = apiVoo;
        this.apiHotel = apiHotel;
    }

    @Override
    public String busca(Voo voo, Hotel hotel) {
        return apiVoo.buscarVoos(voo) + "\n" + apiHotel.buscarHotels(hotel);
    }
}
