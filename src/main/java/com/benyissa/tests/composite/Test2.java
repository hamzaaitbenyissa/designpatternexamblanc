package com.benyissa.tests.composite;

import com.benyissa.app.*;

public class Test2 {

    public static void main(String[] args) {

        Dessin dessin = new Dessin();

//      let's create two circles first
        Circle circle1 = new Circle(5, new Point(0, 0));
        Circle circle2 = new Circle(5, new Point(1, 0));

//       let's group them
        Groupe groupe1 = new Groupe();
        groupe1.ajouterfigure(circle1);
        groupe1.ajouterfigure(circle2);

//      let's create two circles rectangles
        Rectangle rectangle1 = new Rectangle(4, 4, new Point(1, 1));
        Rectangle rectangle2 = new Rectangle(4, 4, new Point(1, 1));

//      let's group them
        Groupe groupe2 = new Groupe();
        groupe2.ajouterfigure(rectangle1);
        groupe2.ajouterfigure(rectangle2);
//       let's add the group 1 into group 2
        groupe2.ajouterfigure(groupe1);

//      let's add the group 2 into our design

        dessin.ajouterfigure(groupe2);
        dessin.afficher();

    }
}
