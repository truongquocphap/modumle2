package bai06_inheritanc.bai_tap.shape_triangle;

public class TestShape {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
        System.out.println("-----thay doi gia tri-----");
        shape=new Shape("yellow",true);
        System.out.println(shape);
    }
}
