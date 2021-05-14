package bai_07_interface_and_abstract.bai_tap.resizeable;

import bai06_inheritanc.thuc_hanh.hinh_hoc.Rectangle;

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
       this.setLength1(this.getLength()*Math.sqrt(1+percent/100)*(this.getLength()/this.getWidth()));
        System.out.println("rectangle of area: "+this.getLength());
    }

    @Override
    public void area() {
        System.out.println("rectangle of area: "+this.getArea());
    }
}
