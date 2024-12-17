package com.example.Library_app.model;

import jakarta.persistence.*;
@Entity
public class Rower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private int year;
    private String type;
    private int swheel;
    private String derailleurs;
    private double lat;
    private double lon;
    private String station;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {return type;}
    public void setType(String type) {
        this.type = type;
    }

    public int getSwheel() {
        return swheel;
    }
    public void setSwheel(int swheel) {
        this.swheel = swheel;
    }

    public String getDerailleurs() {return derailleurs;}
    public void setDerailleurs(String derailleurs) {
        this.derailleurs = derailleurs;
    }

    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }
    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getStation() {
        return station;
    }
    public void setStation(String station) {
        this.station = station;
    }
}
