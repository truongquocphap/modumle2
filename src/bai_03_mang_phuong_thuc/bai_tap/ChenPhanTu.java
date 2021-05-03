package bai_03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class ChenPhanTu {
    public static int[] arr(int[] arr,int num,int index){
               for (int j = 7; j >=(index-1); j--) {
                   arr[j]=arr[j-1];
               }
               arr[index-1]=num;


return arr;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] arr=new int[10];
        arr[0]=9;
        arr[1]=4;
        arr[2]=5;
        arr[3]=8;
        arr[4]=34;
        arr[5]=12;
        arr[6]=11;
        System.out.println("nhap so can chen");
        int num=scanner.nextInt();
        System.out.println("nhap vi tri can chen:");
        int index=scanner.nextInt();
        if (index>=arr.length-1||index<=0){
            System.out.println("khong chen duoc vi tri vao mang");
        }else {
           int[] new_arr= arr(arr,num,index);
            for (int i = 0; i <new_arr.length-2; i++) {
                System.out.println(new_arr[i]);
            }
        }

    }
}
