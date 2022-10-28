package com.benyissa;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    List<Figure> figures = new ArrayList<>();

    public void ajouterfigure(Figure figure) {
        figures.add(figure);
    }

    void supprimerfigure(Figure figure) {
        figures.remove(figure);
    }

    public void afficher() {
        System.out.println("Dessin");
        figures.forEach(figure -> figure.afficher(figure.getClass().getSimpleName()));
    }

    void serialiser() {
        System.out.println("serialisation en fichier binaire ");
    }

}
