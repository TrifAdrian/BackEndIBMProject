package ibm.practica.checkin.domain.model;

import java.util.List;

public final class ClassDto {

    private String name;
    private Integer year;
    private String section;

    private List<ClassroomDto> classroom;
    private List<UserFullName> teacher;
    private List<ScheduleDto> dateList;

    public ClassDto() {
    }

    public ClassDto(String name, Integer year, String section, List<ClassroomDto> classroom, List<UserFullName> teacher, List<ScheduleDto> dateList) {
        this.name = name;
        this.year = year;
        this.section = section;
        this.classroom = classroom;
        this.teacher = teacher;
        this.dateList = dateList;
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

    public List<ClassroomDto> getClassroom() {
        return classroom;
    }

    public void setClassroom(List<ClassroomDto> classroom) {
        this.classroom = classroom;
    }

    public List<UserFullName> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<UserFullName> teacher) {
        this.teacher = teacher;
    }
}
