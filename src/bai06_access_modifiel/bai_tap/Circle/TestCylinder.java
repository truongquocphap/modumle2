package bai06_access_modifiel.bai_tap.Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        cylinder=new Cylinder(3.4,"yellow",4.6);
        System.out.println(cylinder);
    }
}
