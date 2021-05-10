package bai_07_interface_and_abstract.bai_tap.colorable;

import bai06_access_modifiel.thuc_hanh.hinh_hoc.Square;

public class SquareColor extends Square implements ColorAble {
    @Override
    public String howtoColor() {
        return "Color all four sides.";
    }
    public double Area(){
       return this.getArea();
    }
//    @Override
//    public double Area() {
//        return this.getArea();
//    }
}
