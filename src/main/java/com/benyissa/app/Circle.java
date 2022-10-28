package com.benyissa.app;


public class Circle extends Figure {
    double rayon;
    Point centre;

    public Circle(double r, Point c) {
        super(r * Math.PI * 2, r * r * Math.PI);
        this.rayon = r;
        this.centre = c;
    }

    @Override
    public void afficher(String msg) {
        super.afficher(msg);
    }

    @Override
    public void update(DefaultSettings defaultSettings) {
        super.update(defaultSettings);
        System.out.println("Circle : Thank you ❤ but I don't care 😅 ");
        System.out.println("My Settings will stay as they are : ");
        System.out.println(settings);
    }
}
