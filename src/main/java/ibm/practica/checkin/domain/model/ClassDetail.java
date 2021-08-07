package ibm.practica.checkin.domain.model;

import java.util.List;

public final class ClassDetail {


    private String name;
    private Integer year;
    private String section;
    private Long TeacherId;
    private Long ClassroomId;
    private List<ScheduleDto> dates;

    public ClassDetail() {
    }

    public ClassDetail( String name, Integer year, String section, Long teacherId, Long classroomId, List<ScheduleDto> dates) {

        this.name = name;
        this.year = year;
        this.section = section;
        TeacherId = teacherId;
        ClassroomId = classroomId;
        this.dates = dates;
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
        return TeacherId;
    }

    public void setTeacherId(Long teacherId) {
        TeacherId = teacherId;
    }

    public Long getClassroomId() {
        return ClassroomId;
    }

    public void setClassroomId(Long classroomId) {
        ClassroomId = classroomId;
    }

    public List<ScheduleDto> getDates() {
        return dates;
    }

    public void setDates(List<ScheduleDto> dates) {
        this.dates = dates;
    }
}
