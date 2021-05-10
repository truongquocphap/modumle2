package bai_tap_tu_hoc.absttract;

abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("ve hinh chu nhat");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("ve hinh tron");
    }
}
