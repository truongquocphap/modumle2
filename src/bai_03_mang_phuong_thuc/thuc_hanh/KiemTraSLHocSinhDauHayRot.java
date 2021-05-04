package bai_03_mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class KiemTraSLHocSinhDauHayRot {
    public static void main(String[] args) {
        int [] arr;
        int arr_size;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("nhap so luong sinh vien");
            arr_size=Integer.parseInt(scanner.nextLine());
            if (arr_size>30){
                System.out.println("so luong SV phai duoi 30");
            }
        }while (arr_size>30);

        arr=new int[arr_size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("moi nhap diem SV thu: "+(i+1));
            arr[i]=scanner.nextInt();
        }
        int dem=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
            if (arr[i]>=5 && arr[i]<=10){
                dem++;
            }

        }
        System.out.println("\n Số lượng sinh viên đã đỗ kì thi la: "+dem);
    }
}
