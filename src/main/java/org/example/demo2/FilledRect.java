package org.example.demo2;

import javafx.scene.paint.Color;

public class FilledRect {
    private Color color;
    private double x;
    private double y;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public FilledRect(Color color, double x, double y) {
        super();
        this.color = color;
        this.x = x;
        this.y = y;
    }
}
