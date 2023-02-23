package com.example.vectores;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("jhoel");
        vector.add("juan");
        vector.add("yeison");
        System.out.println("Vector inicial: "+ vector);
        vector.remove(2);
        System.out.println("vector de posicion 2 fue eliminado:" + vector);
    }
}
