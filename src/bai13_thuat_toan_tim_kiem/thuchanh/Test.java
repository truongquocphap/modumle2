package bai13_thuat_toan_tim_kiem.thuchanh;

public class Test {
    public static void main(String[] args) {
        BinarySearch listBinary=new BinarySearch();
        System.out.println(listBinary.binarySearch((listBinary.list),2));
        System.out.println(listBinary.binarySearch((listBinary.list),5));
        System.out.println(listBinary.binarySearch((listBinary.list),9));
        System.out.println(listBinary.binarySearch((listBinary.list),98));
    }
}
