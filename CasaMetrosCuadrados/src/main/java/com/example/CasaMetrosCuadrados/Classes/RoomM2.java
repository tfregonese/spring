package com.example.CasaMetrosCuadrados.Classes;

public class RoomM2 {
    private String name;
    private double m2;

    public RoomM2(String name, double m2) {
        this.name = name;
        this.m2 = m2;
    }

    public RoomM2() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }
}
