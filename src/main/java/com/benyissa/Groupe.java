package com.benyissa;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure {
    public List<Figure> figures;


    public Groupe() {
        figures = new ArrayList<>();
    }

    public void ajouterfigure(Figure figure) {
        figure.level=this.level+1;
        figures.add(figure);
    }

    void supprimerfigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public void afficher(String msg) {
        super.afficher(msg);
        figures.forEach(figure -> {
                    System.out.print("      ".repeat(this.level));
                    figure.afficher(figure.getClass().getSimpleName());
                }
        );
    }
}
