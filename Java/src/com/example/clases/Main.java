package com.example.clases;

public class Main {
    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone("Iphone 13",1354.564,"Rojo","mediano","ios 16");
        SmartWatch relog = new SmartWatch("Watch 13",154.21,"Verde","mediano");
        System.out.println(celular.nombre);
        System.out.println(relog.color);

    }
}
