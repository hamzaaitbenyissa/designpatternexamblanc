package com.benyissa.app;

import java.util.stream.Stream;

public abstract class Figure {
    double perimetre;
    double interace;
    protected int level = 1;

    public Figure(double perimetre, double interace) {
        this.perimetre = perimetre;
        this.interace = interace;
    }




    public Figure() {
    }

    public void afficher(String msg) {
        System.out.println("      " + msg);
    }
}
