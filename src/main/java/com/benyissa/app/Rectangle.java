package com.benyissa.app;

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
    public void afficher(String msg) {
        super.afficher(msg);
    }
}
