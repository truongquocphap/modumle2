package bai_02_vong_lap.thu_hanh;

import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        System.out.println("ung dung tinh tien lai dua theo so tien muon vay");
        Scanner input=new Scanner(System.in);
        System.out.println("moi nhap so tien muon vay: ");
        double tienVay=input.nextDouble();
        System.out.println("moi nhap so thang muon vay:");
        int thang=input.nextInt();
        System.out.println("moi nhap phan tram lai xuat theo thang");
        double laiXuat=input.nextDouble();
        double laiXuatPhaiTra=0;
        for (int i = 0; i < thang; i++) {
            laiXuatPhaiTra+=(tienVay*(laiXuat/100)/(12/thang));
        }
        System.out.println("tong so tien lai phai tra la: "+laiXuatPhaiTra);
    }
}
