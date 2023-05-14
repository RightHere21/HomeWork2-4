package com.example.dzz2;

import java.io.Serializable;

public class User implements Serializable {

    private String id;
    private String mesto;
    private String time1;
    private String time2;
    private String bilet;

    public User(String id, String mesto, String time1, String time2, String bilet) {
        this.id = id;
        this.mesto = mesto;
        this.time1 = time1;
        this.time2 = time2;
        this.bilet = bilet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getBilet() {
        return bilet;
    }

    public void setBilet(String bilet) {
        this.bilet = bilet;
    }

}
