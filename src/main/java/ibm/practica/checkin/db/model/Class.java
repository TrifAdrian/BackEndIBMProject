package ibm.practica.checkin.db.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
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
    private Set<User> students;

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

    public Class(Long id, String name, Integer year, String section, List<User> teacher, Set<User> students, Set<Classroom> classrooms, List<Schedule> classDates) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.section = section;
        this.teacher = teacher;
        this.students = students;
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

    public Set<User> getStudents() {
        return students;
    }

    public void setStudents(Set<User> students) {
        this.students = students;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Class other = (Class) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", section='" + section + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                ", classrooms=" + classrooms +
                ", classDates=" + classDates +
                '}';
    }
}
