package bai_7_abstract_and_interface.thuc_hanh.interface_comparable;
import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        ComparableCricle[] cricle=new ComparableCricle[3];
        cricle[0]=new ComparableCricle(5.7);
        cricle[1]=new ComparableCricle();
        cricle[2]=new ComparableCricle(4.6,"indigo");

        System.out.println("pre-sorted");
        for (ComparableCricle cricled: cricle) {
            System.out.println(cricled);
        }
        Arrays.sort(cricle);

        System.out.println("after-sorted");
        for (ComparableCricle circle :
                cricle) {
            System.out.println(circle);

        }
    }
}
