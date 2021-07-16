package ibm.practica.checkin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@ApiModel
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ApiModelProperty (value = "numele materiei")
    private String name;
    private User teacher;
    private Integer year;
    private String section;
    private List<User> studentList;
    private Classroom classroom;


    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Class(String name, User teacher, Integer year, String section, List<User> studentList, Classroom classroom) {
        this.name = name;
        this.teacher = teacher;
        this.year = year;
        this.section = section;
        this.studentList = studentList;
        this.classroom = classroom;
    }

    public Class() {
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", section='" + section + '\'' +
                '}';
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

}
