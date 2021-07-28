package ibm.practica.checkin.db.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate localDate;

    @ManyToOne
    private Class aClass;

    public Schedule() {

    }

    public Schedule(Long id, LocalDate localDate, Class aClass) {
        this.id = id;
        this.localDate = localDate;
        this.aClass = aClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

}
