package Mesa;

import java.util.List;

public class ApiHotel {
    private List<Hotel> hotelList;

    public ApiHotel(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    public Hotel buscarHotels(Hotel hotel) {
        Hotel hoteis = new Hotel(hotel.getCidade(), hotel.getDataEntrada(), hotel.getDataSaida());
        for (Hotel h : this.hotelList){
            if (h.getCidade().equals(hotel) && h.getDataEntrada().equals(hotel) && h.getDataSaida().equals(hotel))
                hoteis = h;
        }
        return hoteis;
    }
}
