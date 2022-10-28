package com.benyissa.app;

import java.util.ArrayList;
import java.util.List;

public class DefaultSettings {

    Settings settings = new Settings(1, 1, 1);

    private final List<SettingsObserver> observers = new ArrayList<>();

    public void setState(int thicknessOutline, int outlineColor, int fillColor) {
        this.settings.setThicknessOutline(thicknessOutline);
        this.settings.setOutlineColor(outlineColor);
        this.settings.setFillColor(fillColor);
    }

    public Settings getState() {
        return new Settings(this.settings.getThicknessOutline(), this.settings.getOutlineColor(), this.settings.getFillColor());
    }

    public void addObserver(SettingsObserver settingsObserver) {
        observers.add(settingsObserver);

    }

    public void removeObserver(SettingsObserver settingsObserver) {
        observers.remove(settingsObserver);
    }

    public void notifyObservers() {
        observers.forEach(settingsObserver -> settingsObserver.update(this));
    }


}
