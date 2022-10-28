package com.benyissa.tests.observer;

import com.benyissa.app.*;

public class Test1 {

    public static void main(String[] args) {

//        let's create and display default settings
        DefaultSettings defaultSettings = new DefaultSettings();
        System.out.println("Default Settings : ");
        System.out.println(defaultSettings.getState());
//        let's create two shapes

        Circle circle1 = new Circle(5, new Point(0, 0));
        Rectangle rectangle1 = new Rectangle(4, 4, new Point(1, 1));

//        let's give them new settings
        circle1.setSettings(new Settings(2, 2, 2));
        rectangle1.setSettings(new Settings(4, 4, 4));

//      let's add circle 1 and rectangle 1 as observers of default settings
        defaultSettings.addObserver(circle1);
        defaultSettings.addObserver(rectangle1);

//        let's change the default settings
        defaultSettings.setState(6, 6, 6);

//      here we go,let's notify observers and see their behaviors

        defaultSettings.notifyObservers();

//        if you check the update function of circle and rectangle when they get notified
//        you will find that circles don't care about default settings but rectangles do

    }
}
