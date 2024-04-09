package org.achrafsoltani.games.lzladx.engine.geometry;

public class Dimension {

    private double width;

    private double height;

    public Dimension(double w, double h){
        this.height = h;
        this.width = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
