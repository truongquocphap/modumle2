package bai_01_baiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int tiGia=23000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so tien usd can doi sang tien viet");
        double usd=scanner.nextDouble();
        System.out.println("so tien chuyen sang tien viet la: "+(usd*tiGia));
    }
}
