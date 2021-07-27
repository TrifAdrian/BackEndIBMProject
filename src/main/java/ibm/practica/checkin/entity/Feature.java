package ibm.practica.checkin.entity;

import javax.persistence.*;


@Embeddable
public class Feature {

    private String name;

    public Feature() {
    }

    public Feature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
