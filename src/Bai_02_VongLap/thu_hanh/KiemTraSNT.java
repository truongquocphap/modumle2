package Bai_02_VongLap.thu_hanh;

import java.util.Scanner;

public class KiemTraSNT {

    public static int nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so nguyen bat ki de kiem tra co phai la so nguyen to hay khong");
        int soNguyen=0;
        boolean kiemTra = false;
        while (!kiemTra) {
            try {
                soNguyen = input.nextInt();
                kiemTra = true;
            } catch (Exception e){
                System.out.println("Giá trị phải là số, hãy nhập lại...");
                input.nextLine();
            }
        }
        return soNguyen;
    }
    public static void main(String[] args) {
        int soNguyen=nhap();
     if (soNguyen<2){
         System.out.println("số bạn vừa nhập không phải là số nguyên tố");
     }
     boolean check=true;
        for (int i = 2; i < soNguyen; i++) {
            if(soNguyen%i==0){
                check=false;
                System.out.println("so ban vua nhap khong phai la so nguyen to");
                break;
            }
        }
        if (check){
            System.out.printf("so ban vua nhap la so nguyen to");
        }
    }
}
