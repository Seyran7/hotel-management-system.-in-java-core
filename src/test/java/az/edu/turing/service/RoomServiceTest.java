package az.edu.turing.service;

import az.edu.turing.entity.Hotel;
import az.edu.turing.entity.HotelNetwork;
import az.edu.turing.entity.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoomServiceTest {
    private HotelNetwork hotelNetwork;
    private RoomService roomService;

    @BeforeEach
   public void setUp() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("101","Single",50));
        rooms.add(new Room("102","Double",80));

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(1L,"Hilton Baku","+994",
                "Hilton@gmail.com","Luxury Hotel",
                "Baku","5 star","Spa,pool",rooms));
        hotelNetwork = new HotelNetwork(hotels);
        roomService = new RoomService(hotelNetwork);
    }
    @Test
    public void testAddRoom() {
        Room newRoom = new Room("101","Single",50);
        boolean added = roomService.addRoom(1L,newRoom);

        assertTrue(added,"Room should have been added");
        assertEquals(3,hotelNetwork.getHotels().get(0).getRooms().size(),"");

    }
    @Test
    public void testRemoveRoom() {
        Room newRoom = new Room("101","Single",50);
        boolean removed = roomService.removeRoom(1L,newRoom);
        assertTrue(removed,"Room should have been removed");
        assertEquals(1,hotelNetwork.getHotels().get(0).getRooms().size(),"Hotel should have 1 room left after removal");
    }

    @Test
    public void testFindRoomsByNumber() {
      Room faundRoom=roomService.findRoomByNumber(1L,"101");
      assertNotNull(faundRoom,"Room should be found");
      assertEquals("Single",faundRoom.getRoomType(),"Room type should be single");
    }
}
