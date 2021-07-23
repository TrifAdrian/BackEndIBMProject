package ibm.practica.checkin.entity;

import javax.persistence.*;

@Entity
@Table
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleid;
    private Long classid;
    private Long classrid;
    private String date;
    private String time;

    public Schedule() {
    }

    public Schedule(Long classid, Long classrid, String date, String time) {
        this.classid = classid;
        this.classrid = classrid;
        this.date = date;
        this.time = time;
    }

    public Long getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Long scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public Long getClassrid() {
        return classrid;
    }

    public void setClassrid(Long classrid) {
        this.classrid = classrid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
