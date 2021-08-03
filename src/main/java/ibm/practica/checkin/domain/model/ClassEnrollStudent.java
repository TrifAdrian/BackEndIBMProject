package ibm.practica.checkin.domain.model;

public final class ClassEnrollStudent {

    private String classname;
    private StudentDetails studentDetails;

    public ClassEnrollStudent(String classname, StudentDetails studentDetails) {
        this.classname = classname;
        this.studentDetails = studentDetails;
    }

    public ClassEnrollStudent() {
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }
}
