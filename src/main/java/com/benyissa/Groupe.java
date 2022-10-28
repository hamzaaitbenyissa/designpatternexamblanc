package com.benyissa;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure {
    List<Figure> figures;

    public Groupe() {

        figures = new ArrayList<>();
    }

    void ajouterfigure(Figure figure) {
        figures.add(figure);
    }

    void supprimerfigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    void afficher(String msg) {
        super.afficher(msg);
        figures.forEach(figure -> {
                    System.out.print("      ");
                    figure.afficher(figure.getClass().getSimpleName().toString());
                }
        );
    }
}
