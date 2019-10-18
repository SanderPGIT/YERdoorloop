package com.doorloop.zwolle.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tafel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private boolean bezet;
    String tafelnummer;

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

    public String getTafelnummer() {
        return tafelnummer;
    }

    public void setTafelnummer(String tafelnummer) {
        this.tafelnummer = tafelnummer;
    }
}

