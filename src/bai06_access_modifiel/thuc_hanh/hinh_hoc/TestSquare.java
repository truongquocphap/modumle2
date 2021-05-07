package bai06_access_modifiel.thuc_hanh.hinh_hoc;

public class TestSquare {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);

        square=new Square(2.3);
        System.out.println(square);

        square=new Square(5.6,"yellow",true);
        System.out.println(square);
    }
}
