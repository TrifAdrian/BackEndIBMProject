package ibm.practica.checkin.dto;

import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel
public class ClassDTO {

    private Long id;
    private String name;
    private UserDTO teacher;
    private Integer year;
    private String section;
    private List<UserDTO> studentList;
    private ClassroomDTO classroomDTO;

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

    public UserDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(UserDTO teacher) {
        this.teacher = teacher;
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

    public List<UserDTO> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<UserDTO> studentList) {
        this.studentList = studentList;
    }

    public ClassroomDTO getClassroomDTO() {
        return classroomDTO;
    }

    public void setClassroomDTO(ClassroomDTO classroomDTO) {
        this.classroomDTO = classroomDTO;
    }
}
