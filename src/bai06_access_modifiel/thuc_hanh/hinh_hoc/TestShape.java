package bai06_access_modifiel.thuc_hanh.hinh_hoc;

public class TestShape {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);

        shape =new Shape("red",false);
        System.out.println(shape);
    }
}
