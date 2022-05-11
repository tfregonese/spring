package com.example.CasaMetrosCuadrados.Classes;

public class Room {
    private String name;
    private double ancho;
    private double largo;

    public Room(){}

    public Room(String name, double ancho, double largo) {
        this.name = name;
        this.ancho = ancho;
        this.largo = largo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
