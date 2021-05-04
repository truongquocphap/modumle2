package bai_03_mang_phuong_thuc.bai_tap;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang 1 chieu");
        int arr_size1=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vao do dai cua mang 2 chieu");
        int arr_size2=Integer.parseInt(scanner.nextLine());
        int[][] arr=new int[arr_size1][arr_size2];
        int max=arr[0][0];
        for (int i = 0; i < arr_size1; i++) {
            for (int j = 0; j < arr_size2; j++) {
                System.out.println("nhap phan tu:"+(i+1)+" "+(j+1));
                arr[i][j]=Integer.parseInt(scanner.nextLine());
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong mang 2 chieu la: "+max);




    }


}
