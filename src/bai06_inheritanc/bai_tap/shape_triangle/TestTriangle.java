package bai06_inheritanc.bai_tap.shape_triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);
        System.out.println("-----thay doi gia tri-----");
        triangle = new Triangle("yellow",true,5.7,6.0,7.4);
        System.out.println(triangle);
    }
}
