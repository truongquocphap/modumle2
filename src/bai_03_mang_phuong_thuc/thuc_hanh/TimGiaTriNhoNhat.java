package bai_03_mang_phuong_thuc.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static int min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr;
        System.out.println("nhap do dai cua mang");
        int arr_size=scanner.nextInt();
        arr =new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            System.out.println("nhap phan tu thu "+(i+1));
            arr[i]= scanner.nextInt();
        }
        System.out.println("cac phan tu ban vua nhap vao la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        System.out.println("gia tri nho nhat co trong mang la: "+min(arr));
    }
}
