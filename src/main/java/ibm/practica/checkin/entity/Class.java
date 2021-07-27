package ibm.practica.checkin.entity;

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

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
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

    @Embedded
    private Schedule schedule;


    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Class(Long id, String name, Integer year, String section, List<User> teacher, Set<User> users, Set<Classroom> classrooms, Schedule schedule) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.section = section;
        this.teacher = teacher;
        this.users = users;
        this.classrooms = classrooms;
        this.schedule = schedule;
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

    public Class(Long id, String name, Integer year, String section, List<User> teacher, Set<User> users, Set<Classroom> classrooms) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.section = section;
        this.teacher = teacher;
        this.users = users;
        this.classrooms = classrooms;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Class() {
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
