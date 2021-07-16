package ibm.practica.checkin.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;


@ApiModel

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String first_name;
    private String last_name;
    @Column(name = "`role`")
    private String role;
    @Column(name = "`year`")
    private Integer year;
    @Column(name = "`department`")
    private String department;
    @Column(name = "`section`")
    private String section;
    @Column(name = "`group`")
    private String  group;

    public User() {
    }

    public User(String first_name, String last_name, String role, Integer year, String department, String section, String group) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.year = year;
        this.department = department;
        this.section = section;

        this.group = group;
    }

    public User(String first_name, String last_name, String role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", role='" + role + '\'' +
                ", year=" + year +
                ", department='" + department + '\'' +
                ", section='" + section + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
