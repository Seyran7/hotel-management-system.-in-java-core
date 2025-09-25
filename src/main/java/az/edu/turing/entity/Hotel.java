package az.edu.turing.entity;

import java.util.List;

public class Hotel {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String description;
    private String location;
    private String rating;
    private String facility;
    private List<Room> rooms;


    public Hotel(Long id, String name, String phone, String email, String description, String location, String rating, String facility, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.description = description;
        this.location = location;
        this.rating = rating;
        this.facility = facility;
        this.rooms = rooms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }


    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", rating='" + rating + '\'' +
                ", facility='" + facility + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}

