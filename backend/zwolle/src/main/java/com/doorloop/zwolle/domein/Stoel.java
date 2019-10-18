package com.doorloop.zwolle.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stoel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    boolean bezet;
    String nummer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getBezet() {
        return bezet;
    }

    public void setBezet(boolean bezet) {
        this.bezet = bezet;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
}
