package bai_03_vonglap_phuongthuc.thuchanh;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang");
        Short [] arr;
        byte arr_size;
        do {
             arr_size=scanner.nextByte();
            if (arr_size>10){
                System.out.println("moi nhap lai---arr_size nho hon 10");
            }
        }while (arr_size>10);
        byte i=0;
        arr=new Short[arr_size];
        while (i<arr_size){
            System.out.println("nhap phan tu so nguyen thu : "+(i+1));
            arr[i]=scanner.nextShort();
            i++;
        }
        Short max=arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("gia tri lon nhat o trong mang la: "+max);
    }
}
