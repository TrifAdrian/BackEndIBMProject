package ibm.practica.checkin.domain.model;

public final class Teacher {
    private Long id;
    private String fullName;
    private String section;
    private String department;

    public Teacher(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Teacher(Long id, String fullName, String section, String department) {
        this.id = id;
        this.fullName = fullName;
        this.section = section;
        this.department = department;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
