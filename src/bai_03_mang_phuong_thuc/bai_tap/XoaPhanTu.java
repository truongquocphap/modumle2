package bai_03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class XoaPhanTu {
    public static int[] arr(int [] arr, int num){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==num){
//                arr[i]=arr[i+1];
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={3,4,5,12,67,87};
        System.out.println("cac phan tu trong mang :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap phan tu can xoa trong mang");
        int num=scanner.nextInt();
        System.out.println("phan tu sau khi xoa la: ");
        int[] new_arr=arr(arr,num);
        for (int i = 0; i <new_arr.length-1 ; i++) {
            System.out.println(new_arr[i]+"\t");
        }
    }
}
