package com.example.Interfaces;

public class Main {
    static CocheCRUD cocheCRUD;
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl("bmw", 2022, 1985.24, "rojo");
    }
}
