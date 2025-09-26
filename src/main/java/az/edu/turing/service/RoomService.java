package az.edu.turing.service;

import az.edu.turing.entity.HotelNetwork;
import az.edu.turing.entity.Room;

import java.util.HashMap;

public class RoomService {

    private HotelNetwork network;

    public RoomService(HotelNetwork network) {
        this.network = network;
    }

    public boolean addRoom(long hotelId, Room room) {
        return network.getHotels().stream()
                .filter(hotel -> hotel.getId().equals(hotelId)).findFirst().map(hotel -> {
                    hotel.getRooms().add(room);
                    System.out.println("Room added: " + room);
                    return true;
                })
                .orElse(false);
    }

    public boolean removeRoom(long hotelId, Room room) {
        return network.getHotels().stream()
                .filter(hotel -> hotel.getId().equals(hotelId))
                .findFirst().map(hotel -> hotel.getRooms()
                        .removeIf(room1 -> room1.getRoomNumber()
                                .equals(room.getRoomNumber()))).orElse(false);

    }

    public Room findRoomByNumber(long hotelId, String roomNumber) {
       return network.getHotels().stream().filter(hotel -> hotel.getId().equals(hotelId))
                .findFirst().map(hotel ->hotel.getRooms().stream()
                .filter(room -> room.getRoomNumber().equals(roomNumber))
                        .findFirst().orElse(null)).orElse(null);
    }
    public boolean updateRoom(long hotelId, Room room) {
        return network.getHotels().stream()
                .filter(hotel ->hotel.getId().equals(hotelId))
                .findFirst().map(hotel -> {
                    for(int i=0; i<hotel.getRooms().size(); i++){
                        if(hotel.getRooms().get(i).getRoomNumber().equals(room.getRoomNumber())){
                            hotel.getRooms().get(i).setRoomNumber(room.getRoomNumber());
                            return true;
                        }
                    }
                    return false;
                })
                .orElse(false);
    }
}
