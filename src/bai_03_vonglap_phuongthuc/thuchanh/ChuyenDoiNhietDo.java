package bai_03_vonglap_phuongthuc.thuchanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double doF;
        double doC;
        Short menu;

        do {
            System.out.println("1: chuyen do F sang do C");
            System.out.println("2: chuyen do C sang do F");
            System.out.println("0: exit");
            System.out.println("nhap nhiet do can doi");
             menu=scanner.nextShort();
            switch (menu){
                case 1:
                    System.out.println("nhap do F de doi sang do C");
                    doF=scanner.nextDouble();
                    System.out.println("do C la: "+doFSangDoC(doF));
                    break;
                case 2:
                    System.out.println("nhap do C de doi sang do F");
                    doC=scanner.nextDouble();
                    System.out.println("Do F la: "+doCSangDoF(doC));
                    break;
                case 0:
                    System.exit(0);

            }
        }while (menu!=0);
    }
    public static double doCSangDoF(double doC){
        double doF=(9.0/5)*(doC+32);
        return doF;
    }
    public static double doFSangDoC(double doF){
        double doC=(5.0/9)*(doF-32);
        return doC;
    }
}
