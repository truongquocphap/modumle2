package bai_07_interface_and_abstract.bai_tap.resizeable;

import bai06_access_modifiel.thuc_hanh.hinh_hoc.Rectangle;

public class Rectangel extends Rectangle implements Resizeable {
    public Rectangel(double weight, double length) {
        this.setWidth(weight);
        this.setLength1(length);
        this.getWidth();
        this.getLength();
    }
//    public void Area(){
//        System.out.println(this.getArea());
//    }
    @Override
    public void resize(double percent) {
        System.out.println("rectangle of area: "+super.getPerimeter()*percent);
    }

    @Override
    public void Area() {
        System.out.println("rectangle of area: "+this.getArea());
    }
}
