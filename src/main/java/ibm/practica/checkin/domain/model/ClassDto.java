package ibm.practica.checkin.domain.model;

import java.util.List;

public final class ClassDto {

    private Long id;
    private String name;
    private Integer year;
    private String section;

    private List<ClassroomDto> classroom;
    private String teacherName;
    private List<ScheduleDto> dateList;

    public ClassDto() {
    }

    public ClassDto(String name, Integer year, String section, ClassroomDto classroom, String teacherName, List<ScheduleDto> dateList) {
        this.name = name;
        this.year = year;
        this.section = section;
        this.classroom = classroom;
        this.teacherName = teacherName;
        this.dateList = dateList;
    }

    public ClassDto(Long id,String name, Integer year, String section, String teacherName) {
        this.id=id;
        this.name = name;
        this.year = year;
        this.section = section;
        this.teacherName = teacherName;
    }

    public ClassDto(String name, Integer year, String section) {
        this.name = name;
        this.year = year;
        this.section = section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<ScheduleDto> getDateList() {
        return dateList;
    }

    public void setDateList(List<ScheduleDto> dateList) {
        this.dateList = dateList;
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

    public ClassroomDto getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassroomDto classroom) {
        this.classroom = classroom;
    }
}
