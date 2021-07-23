package ibm.practica.checkin.entity;

import javax.persistence.*;

@Entity
@Table
public class Classroom {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String location;
    private Integer capacity;
    private Long featureid;

    public Classroom() {
    }

    public Classroom(String location, Integer capacity, Long featureid) {
        this.location = location;
        this.capacity = capacity;
        this.featureid = featureid;
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

    public Long getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
    }
}