package ibm.practica.checkin.entity;

import javax.persistence.*;

@Entity
@Table
public class EnroleStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enroleStudentsId;
    private Long userId;
    private Long classId;

    public EnroleStudents() {
    }

    public EnroleStudents(Long userId, Long classId) {
        this.userId = userId;
        this.classId = classId;
    }

    public Long getEnroleStudentsId() {
        return enroleStudentsId;
    }

    public void setEnroleStudentsId(Long enroleStudentsId) {
        this.enroleStudentsId = enroleStudentsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }
}
