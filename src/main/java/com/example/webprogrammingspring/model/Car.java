package com.example.webprogrammingspring.model;

public class Car {
    private String merke;
    private String type;

    public Car(String merke, String type) {
        this.merke = merke;
        this.type = type;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
