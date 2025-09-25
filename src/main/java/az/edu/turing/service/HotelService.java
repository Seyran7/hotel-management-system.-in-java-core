package az.edu.turing.service;

import az.edu.turing.entity.Hotel;
import az.edu.turing.entity.HotelNetwork;

import java.util.List;

public class HotelService {

    private HotelNetwork network;


    public HotelService(HotelNetwork network) {
        this.network = network;
    }

    public void add(Hotel hotel) {
        network.getHotels().add(hotel);
        System.out.println(hotel.getName() + " has been added to the network");
    }

    public Hotel findById(Long id) {
        return network.getHotels().stream()
                .filter(hotel -> hotel.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean remove(Long id) {
        return network.getHotels().removeIf(hotel -> hotel.getId().equals(id));

    }

    public boolean update(Long id, Hotel hotel) {
        for (Hotel hotel1 : network.getHotels()) {
            if (hotel1.getId().equals(id)) {
                hotel1.setName(hotel.getName());
                hotel1.setDescription(hotel.getDescription());
                hotel1.setPhone(hotel.getPhone());
                hotel1.setEmail(hotel.getEmail());
                hotel1.setLocation(hotel.getLocation());
                hotel1.setRating(hotel.getRating());
                hotel1.setFacility(hotel.getFacility());
                hotel1.setRooms(hotel.getRooms());
                return true;
            }
        }
        return false;
    }

    public Hotel findByName(String name) {
        return network.getHotels().stream()
                .filter(hotel -> hotel.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
    public List<Hotel> findAll() {
        return network.getHotels();
    }
}
