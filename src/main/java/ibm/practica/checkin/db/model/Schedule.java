package ibm.practica.checkin.db.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate localDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classId")
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Schedule other = (Schedule) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", localDate=" + localDate +
                ", aClass=" + aClass +
                '}';
    }
}
