package bai06_access_modifiel.thuc_hanh.hinh_hoc;

public class testCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(3.5);
        System.out.println(circle);
        circle=new Circle("indigo",false,3.5);
        System.out.println(circle);
    }
}
