package com.benyissa;

public class Rectangle extends Figure {
    double largeur;
    double hauteur;
    Point coinsuperieurgauche;

    public Rectangle(double l, double h, Point csg) {
        super(2 * (l + h), l * h);
        this.largeur = l;
        this.hauteur = h;
        this.coinsuperieurgauche = csg;
    }

    @Override
    void afficher(String msg) {
        super.afficher(msg);
    }
}
