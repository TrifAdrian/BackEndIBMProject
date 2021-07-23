package ibm.practica.checkin.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;
    private String name;
    private Integer year;
    private String section;

    private Long teacherId;
    private Long enroleStudentsId;
    private Long classroomId;

    public Class() {
    }

    public Class(String name, Integer year, String section, Long teacherId, Long enroleStudentsId, Long classroomId) {
        this.name = name;
        this.year = year;
        this.section = section;
        this.teacherId = teacherId;
        this.enroleStudentsId = enroleStudentsId;
        this.classroomId = classroomId;
    }

    public Long getClassId() { return classId; }

    public void setClassId(Long classId) {
        this.classId = classId;
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

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getEnroleStudentsId() { return enroleStudentsId; }

    public void setEnroleStudentsId(Long enroleStudentsId) {
        this.enroleStudentsId = enroleStudentsId;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }
}
