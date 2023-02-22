package com.example;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un precio");
        double i = sc.nextInt();
        System.out.println("El precio incluido el IVA es: "+ iva(i));
    }
    static double iva(double precio){
        return precio + precio*0.18;
    }
}
