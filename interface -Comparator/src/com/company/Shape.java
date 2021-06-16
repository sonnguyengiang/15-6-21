package com.company;

public class Shape{
    private double radius;
    private boolean filled;
    public Shape(){}
    public Shape(double radius, boolean filled){
        this.radius = radius;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "radius=" + radius +
                ", filled=" + (isFilled() ? "filled" : "not filled") +
                '}';
    }
}
