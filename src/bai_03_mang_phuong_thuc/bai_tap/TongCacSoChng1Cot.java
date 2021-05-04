package bai_03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TongCacSoChng1Cot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so hang cua mang");
        int soHang=scanner.nextInt();
        System.out.println("nhap so cot cua mang");
        int soCot=scanner.nextInt();
        double [][] arr=new double[soHang][soCot];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("nhap tung phan tu bang so thuc "+(i+1)+(j+1));
                arr[i][j]=scanner.nextDouble();
            }
        }
        System.out.println("nhập vào cột muốn tính tổng: ");
        int cot=scanner.nextInt();
        if (cot>arr[0].length){
            System.out.println("cot ban muon tinh tong vua nhap lon hon so cot co trong mang");

        }else {
            double tongCot=0;
            for (int i = 0; i < arr.length; i++) {
                tongCot+= arr[i][cot-1];
            }
            System.out.println("tong cua cot ban muon tinh la: "+tongCot);
        }

    }
}
