package bai_03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class PhanTuNhoNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang 1 chieu");
        int arr_size1=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so luong cua mang 2 chieu");
        int arr_size2=scanner.nextInt();
        int [][] arr=new int[arr_size1][arr_size2];

        for (int i = 0; i < arr_size1; i++) {
            for (int j = 0; j < arr_size2; j++) {
                System.out.println("nhap phan tu thu "+(i+1)+(j+1));
                arr[i][j]=scanner.nextInt();
            }
        }
        int min=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("gia tri nho nhat trong mang 2 chieu la: "+min);
    }
}
