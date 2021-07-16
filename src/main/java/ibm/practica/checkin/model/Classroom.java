package ibm.practica.checkin.model;

import io.swagger.annotations.ApiModel;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.HashMap;

@ApiModel
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "location")
    private String location;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "features")
    private String features;
    private HashMap<Integer,User> chair_slots;

    public HashMap<Integer, User> getChair_slots() {
        return chair_slots;
    }

    public void setChair_slots(HashMap<Integer, User> chair_slots) {
        this.chair_slots = chair_slots;
    }

    public Classroom(String location, Integer capacity, String features) {
        this.location = location;
        this.capacity = capacity;
        this.features = features;
        
    }

    public Classroom() {
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", features='" + features + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
