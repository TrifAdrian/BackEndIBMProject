package ibm.practica.checkin.domain.model;



public final class StudentDetails {

    private String firstName;
    private String lastName;
    private Integer year;
    private String section;


    public StudentDetails() {
    }

    public StudentDetails(String firstName, String lastName, Integer year, String section) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.section = section;

    }

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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
