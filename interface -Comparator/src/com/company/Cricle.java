package com.company;
import java.util.Comparator;
public class Cricle implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 1;
    }
}
