package bai_tap_tu_hoc.interface_don_gian;

public interface Printable {
    void print();
}

class A6 implements Printable{
    @Override
    public void print() {
        System.out.println("hi codegym");
    }

    public static void main(String[] args) {
        A6 a6=new A6();
        a6.print();
    }
}

