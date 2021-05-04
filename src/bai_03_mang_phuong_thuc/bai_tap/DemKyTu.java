package bai_03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str="asasdfefd";
        System.out.println("nhap vao 1 ki tu de kiem tra co bao nhieu ki tu nam trong chuoi");
        String KTstr=scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str[i]==KTstr)
        }
    }
}
