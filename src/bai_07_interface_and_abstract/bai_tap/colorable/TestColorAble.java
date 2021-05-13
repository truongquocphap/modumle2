package bai_07_interface_and_abstract.bai_tap.colorable;

import bai06_inheritanc.thuc_hanh.hinh_hoc.Shape;

public class TestColorAble {
    public static void main(String[] args) {
        Shape shapes[]=new Shape[3];
        shapes[0]=new SquareColor();
        shapes[1]= new CircleColor();
        shapes[2]=new RectangleColor();

        System.out.println("các phần tử trong mang là: ");
        for (Shape color:shapes
             ) {
            System.out.println(color);
        }


        System.out.println("đối tượng thuộc lớp colorAble:");
        for (Shape square: shapes) {
            System.out.println(square.toString());
            if (square instanceof SquareColor){
                ColorAble colorAble= (ColorAble) square;
                System.out.println(colorAble.howtoColor());

            }
        }
    }
}
