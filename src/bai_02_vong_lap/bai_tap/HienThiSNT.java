package bai_02_vong_lap.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HienThiSNT {
    public static String SNT(int so){
        int soNguyen =0;
        int dem = 0;
        String chuoiSNT="";
        while (dem<so){
            boolean check=true;
            if (soNguyen<2){
                check=false;
            }else {
                for (int i = 2; i <soNguyen ; i++) {
                    if (soNguyen%i==0){
                        check=false;
                        break;
                    }
                }
            }
            if (check){
                chuoiSNT+=soNguyen+" ";
                dem++;
            }

            soNguyen++;
        }
        return chuoiSNT;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" nhap vao so luong so nguyen to can in ra");
        int soNguyen=input.nextInt();
        System.out.println(SNT(soNguyen));
    }
}
