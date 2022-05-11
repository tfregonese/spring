package com.example.CasaMetrosCuadrados.DTO;

import com.example.CasaMetrosCuadrados.Classes.Room;

public class CasaDTO {
    private String name;
    private String direccion;
    private Room[] rooms;

    public CasaDTO(){}
    public CasaDTO(String name, String direccion, Room[] rooms) {
        this.name = name;
        this.direccion = direccion;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
