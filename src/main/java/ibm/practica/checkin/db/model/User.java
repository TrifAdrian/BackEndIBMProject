package ibm.practica.checkin.db.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
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

//    @ManyToOne()
//    @JoinColumn(name = "classId")
//    private Class aClass;
    @JsonManagedReference
    @OneToMany(mappedBy = "teacher")
    private List<Class> classes;

    @JsonBackReference
    @ManyToMany(cascade = {
            CascadeType.REFRESH,
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST
    },fetch = FetchType.LAZY)
    @JoinTable(
            name = "EnroledStudents",
            joinColumns= @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "classId"),
            foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT),
            inverseForeignKey = @ForeignKey(ConstraintMode.CONSTRAINT)
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
        this.enroledStudents = enroledStudents;
       // this.aClass = aClass;
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


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
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

}
