package az.edu.turing.entity;

import java.util.List;

public class HotelNetwork {
    private List<Hotel> hotels;

    public HotelNetwork(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    @Override
    public String toString() {
        return "HotelNetwork{" +
                " hotels=" + hotels +
                '}';
    }
}
