package com.benyissa.app;

import java.util.stream.Stream;

public abstract class Figure implements SettingsObserver {
    double perimetre;
    double interace;

    Settings settings;

    protected int level = 1;

    public Figure(double perimetre, double interace) {
        this.perimetre = perimetre;
        this.interace = interace;
    }

    public Figure() {
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Settings getSettings() {
        return settings;
    }

    public void afficher(String msg) {
        System.out.println("      " + msg);
    }

    @Override
    public void update(DefaultSettings defaultSettings) {
        System.out.println("I heard that defaultSettings have been changed ");
        System.out.println("new DefaultSettings :");
        System.out.println(defaultSettings.getState());
    }

    public void displaySettings(Settings settings) {
        System.out.println(settings);
    }
}
