package ibm.practica.checkin.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(name = "`year`")
    private Integer year;
    private Role role;
    private String department;
    private String section;

    @ManyToOne()
    private Class aClass;

    @ManyToMany
    @JoinTable(
            name = "EnroledStudents",
            joinColumns= @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "classId")
    )
    private Set<Class> enroledStudents;

    public User() {
    }

    public User(Long id, String firstName, String lastName, Integer year, Role role, String department, String section, Class aClass, Set<Class> enroledStudents) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.role = role;
        this.department = department;
        this.section = section;
        this.aClass = aClass;
        this.enroledStudents = enroledStudents;
        this.aClass = aClass;
    }

    public Set<Class> getEnroledStudents() {
        return enroledStudents;
    }

    public void setEnroledStudents(Set<Class> enroledStudents) {
        this.enroledStudents = enroledStudents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
