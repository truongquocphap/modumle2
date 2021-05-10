package bai_tap_tu_hoc.interface_don_gian;

public interface Printable1 extends Printable {
   void print1();
}
class A7 implements Printable1{
    @Override
    public void print1() {
        System.out.println("hello print1");
    }

    @Override
    public void print() {
        System.out.println("hello print :");
    }

    public static void main(String[] args) {
        A7 a7=new A7();
        a7.print1();
        a7.print();
    }
}
