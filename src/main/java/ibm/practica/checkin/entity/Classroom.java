package ibm.practica.checkin.entity;

import org.hibernate.annotations.LazyCollection;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private Integer capacity;

    @ElementCollection
    @CollectionTable
    private List<Feature> features;

    public Classroom(Long id, String location, Integer capacity, List<Feature> features) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.features = features;
    }

    @ManyToMany(mappedBy = "classrooms")
    private Set<Class> classes;

    public Set<Class> getClasses() {
        return classes;
    }

    public void setClasses(Set<Class> classes) {
        this.classes = classes;
    }

    public Classroom(Long id, String location, Integer capacity, List<Feature> features, Set<Class> classes) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.features = features;
        this.classes = classes;
    }

    public Classroom() {
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

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}