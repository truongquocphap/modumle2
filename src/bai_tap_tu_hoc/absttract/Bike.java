package bai_tap_tu_hoc.absttract;
//bike là lớp trừu tượng chỉ chứa 1 phương thức là run.dk triển khai bới lớp Honda.
//phải kế thừu lại lớp bike trừu tượng mới dk triển khai phương thức của lớp trừu tượng.
abstract class Bike {
    abstract void run();
}
class Honda4 extends Bike{
    @Override
    void run() {
        System.out.println("running safely...");
    }

    public static void main(String[] args) {
        Honda4 honda4=new Honda4();
        honda4.run();
    }
}
