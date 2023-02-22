package com.example.Interfaces;

import java.util.List;

public class CocheCRUD {
    String nombre;
    int año;
    double precio;
    String color;

    public CocheCRUD(String nombre, int año, double precio, String color) {
        this.nombre = nombre;
        this.año = año;
        this.precio = precio;
        this.color = color;
    }


    public void add(CocheCRUD coches) {
    }

    void save(CocheCRUD coche) {

    }

    List<CocheCRUD> findAll() {
        return null;
    }

    void delete(CocheCRUD coche) {

    }
}
