package ibm.practica.checkin.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classid;
    private String name;
    private Integer year;
    private String section;

    private Long teacherid;
    private Long esid;
    private Long classrid;

    public Class() {
    }

    public Class(String name, Integer year, String section, Long teacherid, Long esid, Long classrid) {
        this.name = name;
        this.year = year;
        this.section = section;
        this.teacherid = teacherid;
        this.esid = esid;
        this.classrid = classrid;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
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

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    public Long getEsid() {
        return esid;
    }

    public void setEsid(Long esid) {
        this.esid = esid;
    }

    public Long getClassrid() {
        return classrid;
    }

    public void setClassrid(Long classrid) {
        this.classrid = classrid;
    }
}
