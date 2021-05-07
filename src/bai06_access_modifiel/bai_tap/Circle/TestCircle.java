package bai06_access_modifiel.bai_tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);

        circle=new Circle(3.4,"red");
        System.out.println(circle);
    }
}
