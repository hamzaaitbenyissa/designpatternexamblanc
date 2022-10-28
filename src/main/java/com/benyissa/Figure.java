package com.benyissa;

import java.util.stream.Stream;

public abstract class Figure {
    double perimetre;
    double interace;

    public Figure(double perimetre, double interace) {
        this.perimetre = perimetre;
        this.interace = interace;
    }

    public Figure() {
    }

    void afficher(String msg) {
        System.out.println("      " + msg);
    }
}
