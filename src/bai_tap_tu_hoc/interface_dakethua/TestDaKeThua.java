package bai_tap_tu_hoc.interface_dakethua;

class A7 implements Printable,ShowAble {
    @Override
    public void print() {
        System.out.println("hello");
    }

    @Override
    public void Show() {
        System.out.println("wellcom");
    }

    public static void main(String[] args) {
        A7 a7=new A7();
        a7.print();
        a7.Show();
    }
}
