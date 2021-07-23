package ibm.practica.checkin.entity;

import javax.persistence.*;

@Entity
@Table
public class Classroom {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long classroomId;

    private String location;
    private Integer capacity;
    private Long featureId;

    public Classroom() {
    }

    public Classroom(String location, Integer capacity, Long featureId) {
        this.location = location;
        this.capacity = capacity;
        this.featureId = featureId;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
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

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }
}