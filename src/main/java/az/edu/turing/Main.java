package az.edu.turing;

import az.edu.turing.entity.Hotel;
import az.edu.turing.entity.HotelNetwork;
import az.edu.turing.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Room> hiltonRoom = new ArrayList<>();
        hiltonRoom.add(new Room("101","single",30.00));
        hiltonRoom.add(new Room("102","double",50.00));

        List<Room> marriottRoom = new ArrayList<>();
        marriottRoom.add(new Room("103","single",40.00));
        marriottRoom.add(new Room("104","double",60.00));

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(1L, "Hilton Baku", "+994000", "HiltonBaku@gmail.com", "It's comfortable",
                "Azerbaijan","5 star","Music, sport",hiltonRoom));

        hotels.add(new Hotel(2L,"Marriott","12345","Marriott@gmail.com","Enjoy from your life",
                "BAku","5 star","Music, sport,spa",marriottRoom));

        HotelNetwork network = new HotelNetwork(hotels);




        System.out.println(network);


    }
}
