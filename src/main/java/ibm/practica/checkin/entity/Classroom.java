package ibm.practica.checkin.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Entity
@Table

@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonStringType.class),
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})

public class Classroom {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String location;
    private Integer capacity;
    @Type(type = "json")
    private List<String> features;

    @Type(type = "json")
    private HashMap<Integer, User> chair_slots;

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

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public HashMap<Integer, User> getChair_slots() {
        return chair_slots;
    }

    public void setChair_slots(HashMap<Integer, User> chair_slots) {
        this.chair_slots = chair_slots;
    }
}