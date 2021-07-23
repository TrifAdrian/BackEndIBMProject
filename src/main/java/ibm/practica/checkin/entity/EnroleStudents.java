package ibm.practica.checkin.entity;

import javax.persistence.*;

@Entity
@Table
public class EnroleStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long esid;

    private Long userid;
    private Long classid;

    public EnroleStudents() {
    }

    public EnroleStudents(Long userid, Long classid) {
        this.userid = userid;
        this.classid = classid;
    }

    public Long getEsid() {
        return esid;
    }

    public void setEsid(Long esid) {
        this.esid = esid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }
}
