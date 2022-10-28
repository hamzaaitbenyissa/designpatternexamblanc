package com.benyissa.tests.strategy;

import com.benyissa.app.Dessin;
import com.benyissa.app.TreatmentStrategyImpl1;
import com.benyissa.app.TreatmentStrategyImpl2;

public class Test1 {

    public static void main(String[] args) {
        Dessin dessin = new Dessin();
        System.out.println("Design Created ");
        System.out.println("Let's treat it with the first Algorithm ");
        dessin.setTreatmentStrategy(new TreatmentStrategyImpl1());
        dessin.applyTreatment();
        System.out.println("Logic changed, right now we need the second Algorithm ");
        dessin.setTreatmentStrategy(new TreatmentStrategyImpl2());
        dessin.applyTreatment();
    }
}
