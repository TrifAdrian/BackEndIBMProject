package ibm.practica.checkin.dto;

import io.swagger.annotations.ApiModel;

import java.util.HashMap;

@ApiModel
public class ClassroomDTO {

    private Long id;
    private String location;
    private Integer capacity;
    private String features;
    private HashMap<Integer, UserDTO> chair_slots;

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

    public HashMap<Integer, UserDTO> getChair_slots() {
        return chair_slots;
    }

    public void setChair_slots(HashMap<Integer, UserDTO> chair_slots) {
        this.chair_slots = chair_slots;
    }
}
