package bai06_inheritanc.bai_tap.circle;

import bai06_inheritanc.bai_tap.point.Point;

public class TestCylinder_Circle {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        cylinder=new Cylinder(3.4,"yellow",4.6);
        System.out.println(cylinder);

        Point point=new Point();
        System.out.println(point);


        point=new Point(3.5f,6.f);
        System.out.println(point);
    }
}
