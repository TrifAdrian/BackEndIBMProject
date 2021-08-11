package ibm.practica.checkin.domain.model;

import ibm.practica.checkin.db.model.Role;

public final class UserDto {

    private Long id;
    private String name;
    private String section;
    private String department;
    private Integer year;
    private Role role;

    public UserDto() {
    }

    public UserDto(Long id, String name, String section, String department, Integer year, Role role) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.department = department;
        this.year = year;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
}
