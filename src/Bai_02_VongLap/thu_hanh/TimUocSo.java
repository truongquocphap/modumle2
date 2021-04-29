package Bai_02_VongLap.thu_hanh;

import java.util.Scanner;

public class TimUocSo {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("nhap so nguyen thu nhat khac 0");
            int soNGuyen1 = input.nextInt();
            System.out.println("nhap so nguyen thu hai khac 0:");
            int soNguyenThu2 = input.nextInt();
            soNGuyen1 = Math.abs(soNGuyen1);
            soNguyenThu2 = Math.abs(soNguyenThu2);
           if (soNGuyen1==0||soNguyenThu2==0){
               System.out.println("vi hai so ban vua nhap vao la so 0 nen khong tim duoc uoc so chung");
           }
                while (soNGuyen1!=soNguyenThu2){
                    if (soNGuyen1>soNguyenThu2){
                        soNGuyen1=(soNGuyen1-soNguyenThu2);
                    }else {
                        soNguyenThu2=(soNguyenThu2-soNGuyen1);
                    }
                }
            System.out.println("boi chung lon nhat la: "+soNGuyen1);

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
