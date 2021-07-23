package ibm.practica.checkin.entity;

import javax.persistence.*;

@Entity
@Table
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long featureid;
    private String name;
    private Long classrid;

    public Feature() {
    }

    public Feature(String name, Long classrid) {
        this.name = name;
        this.classrid = classrid;
    }

    public Long getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getClassrid() {
        return classrid;
    }

    public void setClassrid(Long classrid) {
        this.classrid = classrid;
    }
}
