package ibm.practica.checkin.entity;

import javax.persistence.*;

@Entity
@Table
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long featureId;
    private String name;
    private Long classroomId;

    public Feature() {
    }

    public Feature(String name, Long classroomId) {
        this.name = name;
        this.classroomId = classroomId;
    }

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }
}
