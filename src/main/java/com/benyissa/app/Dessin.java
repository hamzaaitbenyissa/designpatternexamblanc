package com.benyissa.app;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    List<Figure> figures = new ArrayList<>();

    TreatmentStrategy treatmentStrategy;

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

    public void setTreatmentStrategy(TreatmentStrategy treatmentStrategy) {
        this.treatmentStrategy = treatmentStrategy;
    }

    public void applyTreatment() {
        treatmentStrategy.treat();
    }

}
