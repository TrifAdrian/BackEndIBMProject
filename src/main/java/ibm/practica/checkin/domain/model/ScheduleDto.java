package ibm.practica.checkin.domain.model;


public final class ScheduleDto {

    private String startTime;
    private String endTime;

    public ScheduleDto() {
    }

    public ScheduleDto(String date) {
        this.startTime = date;
    }

    public ScheduleDto(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
