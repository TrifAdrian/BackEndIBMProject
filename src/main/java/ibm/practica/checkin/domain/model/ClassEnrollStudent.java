package ibm.practica.checkin.domain.model;

public final class ClassEnrollStudent {

    private Long classId;
    private Long studentId;


    public ClassEnrollStudent() {
    }


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long id) {
        this.classId = id;
    }
}
