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

    @Override
    public void update(DefaultSettings defaultSettings) {
        super.update(defaultSettings);
        System.out.println("Rectangle  : Thank you ❤  I will switch mine too ");
        this.setSettings(defaultSettings.getState());
        System.out.println("My new Settings : ");
        System.out.println(settings);
    }
}
