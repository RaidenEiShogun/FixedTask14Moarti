package org.example.demo2;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class PaintAppModel {

    private Color currentColor;
    private final ArrayList<FilledRect> rects;

    public PaintAppModel() {
        rects = new ArrayList<>();
    }

    void addPoint(double x, double y) {
        rects.add(new FilledRect(currentColor, x, y));
        ExportDrawings.exportDrawings(rects);
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }
}