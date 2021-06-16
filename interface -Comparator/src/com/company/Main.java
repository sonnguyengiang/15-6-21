package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Shape[] circles = new Shape[3];
        circles[0] = new Shape(3.6,false);
        circles[1] = new Shape();
        circles[2] = new Shape(3.5, true);

        System.out.println("Pre-sorted:");
        for (Shape circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new Cricle();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Shape circle : circles) {
            System.out.println(circle);
        }
    }
}
