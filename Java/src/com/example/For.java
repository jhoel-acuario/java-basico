package com.example;

public class For {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Bless", "Leo", "Danny", "Ronal"};
        for (int i =0; i< nombres.length; i++){
            System.out.println(nombres[i].concat("Hola "));
        }
    }
}
