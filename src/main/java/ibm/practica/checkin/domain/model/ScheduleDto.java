package ibm.practica.checkin.domain.model;



import java.time.LocalDate;


public final class ScheduleDto {

    private LocalDate date;

    public ScheduleDto() {
    }

    public ScheduleDto(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
