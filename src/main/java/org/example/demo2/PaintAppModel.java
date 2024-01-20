package org.example.demo2;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class PaintAppModel {

    private Color currentColor;
    private ArrayList<FilledRect> rects;

    public PaintAppModel() {
        rects =  new ArrayList<FilledRect>();
    }

    void addPoint(double x, double y){
        rects.add(new FilledRect(currentColor, x,y));
        System.out.println(rects);
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }
}
