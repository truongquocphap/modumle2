package bai_7_abstract_and_interface.thuc_hanh.comparator;

import bai06_inheritanc.thuc_hanh.hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<CircleComparator> {


    public CircleComparator() {
    }

    public CircleComparator(double radius) {
        super(radius);
    }

    public CircleComparator(String color, boolean filled) {
        super(color, filled);
    }

    public CircleComparator(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compare(CircleComparator o1, CircleComparator o2) {
        if (o1.getRadius()>o2.getRadius()) return 1;
        else if (o1.getRadius()<o2.getRadius()) return -1;
        else return 0;
    }
}
