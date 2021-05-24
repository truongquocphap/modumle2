package bai15_exception_debug.baitap;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhap canh a: ");
            double edgeA=Double.parseDouble(scanner.nextLine());
            System.out.println("nhap canh a: ");
            double edgeB=Double.parseDouble(scanner.nextLine());
            System.out.println("nhap canh a: ");
            double edgeC=Double.parseDouble(scanner.nextLine());
            try {
                IllegalTriangleException triangle=new IllegalTriangleException(edgeA,edgeB,edgeC);
                System.out.println(triangle.toString());
            } catch (IllegalTriangleException e) {
                System.out.println(e.getErrorMessage());
            }
    }
}
