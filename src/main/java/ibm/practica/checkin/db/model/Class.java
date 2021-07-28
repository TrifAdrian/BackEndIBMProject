package ibm.practica.checkin.db.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer year;
    private String section;

    @OneToMany(mappedBy = "aClass")
    private List<User> teacher;

    @ManyToMany(mappedBy = "enroledStudents")
    private Set<User> users;

    @ManyToMany
    @JoinTable(
            name = "Repartition",
            joinColumns =@JoinColumn(name = "classId"),
            inverseJoinColumns = @JoinColumn(name = "classroomId")
    )
    private Set<Classroom> classrooms;

    @OneToMany(mappedBy="aClass")
    private List<Schedule> classDates;

    public Class() {
    }

    public Class(Long id, String name, Integer year, String section, List<User> teacher, Set<User> users, Set<Classroom> classrooms, List<Schedule> classDates) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.section = section;
        this.teacher = teacher;
        this.users = users;
        this.classrooms = classrooms;
        this.classDates = classDates;
    }

    public List<Schedule> getClassDates() {
        return classDates;
    }

    public void setClassDates(List<Schedule> classDates) {
        this.classDates = classDates;
    }

    public List<User> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<User> teacher) {
        this.teacher = teacher;
    }

    public Set<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Set<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Long getId() { return id; }

    public void setId(Long classId) {
        this.id = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

}
