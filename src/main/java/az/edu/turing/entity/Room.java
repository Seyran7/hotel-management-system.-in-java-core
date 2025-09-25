package az.edu.turing.entity;

import java.util.List;

public class Room {
    private String roomNumber;
    private String roomType;
    private double roomPrice;


    public Room(String roomNumber, String roomType, double roomNumberPrice) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomNumberPrice;
    }
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomNumberPrice() {
        return roomPrice;
    }

    public void setRoomNumberPrice(double roomNumberPrice) {
        this.roomPrice = roomNumberPrice;
    }




    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomType='" + roomType + '\'' +
                ", roomNumberPrice='" + roomPrice + '\'' +
                '}';
    }
}

