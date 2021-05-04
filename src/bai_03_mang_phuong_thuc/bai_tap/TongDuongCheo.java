package bai_03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhập số hành của mảng ");
        int soHang=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số cột phải bằng số hàng trong mảng");
        int soCot=Integer.parseInt(scanner.nextLine());
        double mang2Chieu[][]=new double[soHang][soCot];
        for (int i = 0; i <mang2Chieu.length; i++) {
            for (int j = 0; j < mang2Chieu[i].length; j++) {
                System.out.println("nhập vào số nguyên hay so thực vao trong mảng :"+(i+1)+(j+1));
                mang2Chieu[i][j]=scanner.nextDouble();
            }
        }
        double tongDuongCheo=0;
        for (int i = 0; i < mang2Chieu.length; i++) {
            for (int j = 0; j < mang2Chieu[i].length; j++) {
                if (i==j){
                   tongDuongCheo+= mang2Chieu[i][j];
                }
            }
        }
        System.out.println("tổng đường chéo chính của mảng bạn vừa nhập vào là: "+tongDuongCheo);
    }
}
