package com.example.CasaMetrosCuadrados.DTO;

import com.example.CasaMetrosCuadrados.Classes.Room;
import com.example.CasaMetrosCuadrados.Classes.RoomM2;

public class CasaValueDTO {
    private double totalm2;
    private double valorm2 = 800;
    private Room habitacionMasGrande;
    private RoomM2[] m2;

    public CasaValueDTO(){}

    public CasaValueDTO(double totalm2, int valorm2, Room habitacionMasGrande, RoomM2[] m2) {
        this.totalm2 = totalm2;
        this.valorm2 = valorm2;
        this.habitacionMasGrande = habitacionMasGrande;
        this.m2 = m2;
    }

    public double getTotalm2() {
        return totalm2;
    }

    public void setTotalm2(double totalm2) {
        this.totalm2 = totalm2;
    }

    public double getValorm2() {
        return valorm2;
    }

    public void setValorm2(double valorm2) {
        this.valorm2 = valorm2;
    }

    public Room getHabitacionMasGrande() {
        return habitacionMasGrande;
    }

    public void setHabitacionMasGrande(Room habitacionMasGrande) {
        this.habitacionMasGrande = habitacionMasGrande;
    }

    public RoomM2[] getM2() {
        return m2;
    }

    public void setM2(RoomM2[] m2) {
        this.m2 = m2;
    }
}
