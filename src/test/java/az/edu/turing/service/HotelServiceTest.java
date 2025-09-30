package az.edu.turing.service;

import az.edu.turing.entity.Hotel;
import az.edu.turing.entity.HotelNetwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HotelServiceTest {
    private HotelService hotelService;
    private HotelNetwork hotelNetwork;

    @BeforeEach
    public void setUp() {
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(new Hotel(1L, "Hilton Baku", "+994000", "HiltonBaku@gmail.com",
                "It's comfortable", "Azerbaijan", "5 star", "Music, sport", new ArrayList<>()));

        hotelList.add(new Hotel(2L, "Marriott", "12345", "Marriott@gmail.com",
                "Enjoy from your life", "Baku", "5 star", "Music, sport, spa", new ArrayList<>()));

        hotelNetwork = new HotelNetwork(hotelList);
        hotelService = new HotelService(hotelNetwork);

    }
    @Test
    public void testAddHotel() {
        Hotel newHotel=new Hotel(3L, "Sheraton", "Baku", "+994111", "Luxury hotel",
                "Baku", "5 star", "Spa, Music", new ArrayList<>());
        boolean added=hotelService.add(newHotel);

        assertTrue(added,"New hotel must be added ");
        assertEquals(3, hotelNetwork.getHotels().size(),"Hotel size should be 3");

    }
    @Test
    public void testFindHotelById() {
        Hotel found=hotelService.findById(1L);
        assertNotNull(found,"Hotel should be found");
    }
    @Test
    public void testRemoveHotel() {
        boolean removed=hotelService.remove(1L);
        assertTrue(removed,"Hotel should be removed");
        assertEquals(1,hotelNetwork.getHotels().size(),"Hotel size should be 1");
    }

    @Test
    public void testUpdateHotel() {
        Hotel updatedHotel=new Hotel(1L, "Hilton Updated", "+994999", "newemail@hilton.com",
                "Updated description", "Baku", "5 star", "Updated facilities", new ArrayList<>());
      boolean updated= hotelService.update(1L, updatedHotel);
      assertTrue(updated,"Hotel should be updated");
      Hotel found=hotelService.findById(1L);
      assertEquals("Hilton Updated",found.getName(),"Hilton name  should be updated");
      assertEquals("+994999",found.getPhone(),"Hotel phone number should be updated");

    }
    @Test
    public void testFindHotelByName() {
        Hotel found=hotelService.findByName("Marriott");
        assertNotNull(found,"Hotel should be found");
        assertEquals("Marriott",found.getName(),"Hotel name should be Marriott");
    }

}
