package ibm.practica.checkin.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Embeddable
public class Schedule {

    private LocalDate localDate;

    @OneToMany
    private List<Class> classes;

    public Schedule(LocalDate localDate, List<Class> classes) {
        this.localDate = localDate;
        this.classes = classes;
    }

    public Schedule() {

    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

}
