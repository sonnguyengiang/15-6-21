package com.company;

public class Cricle {
    private double radius;
    private String color;
    private boolean filled;
    public Cricle() {
    }
    public Cricle(double radius){
        this.radius = radius;
    }
    public Cricle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
