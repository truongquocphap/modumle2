package bai_7_abstract_and_interface.thuc_hanh.interface_comparable;

import bai06_access_modifiel.bai_tap.Circle.Circle;

import java.util.Comparator;

public class ComparableCricle extends Circle implements Comparable<ComparableCricle> {

    public ComparableCricle() {
    }
    public ComparableCricle(double radius){
        super(radius);
    }
    public ComparableCricle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public int compareTo(ComparableCricle cricle) {
        if (getRadius() > cricle.getRadius())
            return 1;
        else if (getRadius() < cricle.getRadius())
            return -1;
        else return 1;
    }
}
