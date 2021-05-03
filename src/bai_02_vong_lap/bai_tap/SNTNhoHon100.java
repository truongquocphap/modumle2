package bai_02_vong_lap.bai_tap;

import java.util.ArrayList;

public class SNTNhoHon100 {
    public static String SNT(){
        boolean check1=true;
        int soNguyen=2;
        String chuoiSNT ="";
        while (check1){
            boolean check=true;
                for (int i = 2; i <soNguyen ; i++) {
                    if (soNguyen%i==0){
                        check=false;
                        break;
                    }
                }
           if (check){
                if (soNguyen<100){
                    chuoiSNT+=soNguyen+" ";
                }else {
                    check1=false;
                }
           }
           soNguyen++;
        }
            return chuoiSNT;
    }

    public static void main(String[] args) {
        System.out.println("day so nguyen to duoi 100 la:  "+SNT());
    }
}
