package bai_07_interface_and_abstract.bai_tap.resizeable;

import bai06_inheritanc.thuc_hanh.hinh_hoc.Square;

public class Squere extends Square implements Resizeable {
    public Squere(double side) {
        this.setSide(side);
        getSide();
    }
    //    public void Area(){
    //        System.out.println(this.getArea());
    //    }
    @Override
    public void resize(double percent) {
        System.out.println("Square of area: "+super.getArea()*percent);
    }

    @Override
    public void Area() {
        System.out.println("Square of area: "+this.getArea());
    }
}
