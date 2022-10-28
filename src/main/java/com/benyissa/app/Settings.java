package com.benyissa.app;

import java.util.ArrayList;
import java.util.List;

public class Settings {

    int thicknessOutline;
    int outlineColor;
    int fillColor;

    public Settings(int thicknessOutline, int outlineColor, int fillColor) {
        this.thicknessOutline = thicknessOutline;
        this.outlineColor = outlineColor;
        this.fillColor = fillColor;
    }

    public int getThicknessOutline() {
        return thicknessOutline;
    }

    public void setThicknessOutline(int thicknessOutline) {
        this.thicknessOutline = thicknessOutline;
    }

    public int getOutlineColor() {
        return outlineColor;
    }

    public void setOutlineColor(int outlineColor) {
        this.outlineColor = outlineColor;
    }

    public int getFillColor() {
        return fillColor;
    }

    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return "  thicknessOutline : " + thicknessOutline + "\n  outlineColor : " + outlineColor + "\n  fillColor : " + fillColor ;
    }
}
