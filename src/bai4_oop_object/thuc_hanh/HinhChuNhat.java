package bai4_oop_object.thuc_hanh;

import java.util.Scanner;

public class HinhChuNhat {
    double chieuDai,chieuRong;
    public HinhChuNhat(){
    }
    public HinhChuNhat(double chieuDai,double chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    }
    public double dienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public double chuVi(){
        return (this.chieuRong+this.chieuDai)*2;
    }
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public String hienThi(){
        return "Hinh chu nhat{"+"chieu dai: "+chieuDai+" chieu rong "+chieuRong+" }";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu rong: ");
        double chieuRong=scanner.nextDouble();
        System.out.println("nhap chieu dai: ");
        double chieuDai=scanner.nextDouble();
        HinhChuNhat hinhChuNhat=new HinhChuNhat(chieuDai,chieuRong);
        System.out.println("chieu dai va chieu rong ban nhap vao la:"+hinhChuNhat.hienThi());
        System.out.println("chu vi hinh chu nhat la: "+hinhChuNhat.chuVi());
        System.out.println("dien tich hinh chu nhat la: "+hinhChuNhat.dienTich());
    }
}
