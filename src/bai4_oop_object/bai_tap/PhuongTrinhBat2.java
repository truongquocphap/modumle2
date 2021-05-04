package bai4_oop_object.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBat2 {
    private double a, b, c;

    public PhuongTrinhBat2() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public PhuongTrinhBat2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double kiemTraNghiem() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double nghiemKep() {
        return -this.b / 2 * this.a;
    }

    public double nghiem1() {
        return (-this.b) + Math.sqrt((this.b * this.b) - (4 * this.a * this.c)) / 2 * this.a;
    }

    public double nghiem2() {
        return (-this.b) - Math.sqrt((this.b * this.b) - (4 * this.a * this.c)) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao gia tri a: ");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vao gia tri b: ");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vao gia tri c: ");
        double c = Integer.parseInt(scanner.nextLine());
        PhuongTrinhBat2 phuongTrinhBat2 = new PhuongTrinhBat2(a, b, c);
        if (phuongTrinhBat2.kiemTraNghiem() < 0) {
            System.out.println("phương trình vô nghiệm ");
        } else if (phuongTrinhBat2.kiemTraNghiem() == 0) {
            System.out.println("phương trình bật 2 có nghiệm kép :" + phuongTrinhBat2.nghiemKep());

        } else {
            System.out.println("phương trình có 2 nghiệm: \n" +
                    "nghiệm thứ nhất :" + phuongTrinhBat2.nghiem1() +
                    "\n nghiệm thứ hai :" + phuongTrinhBat2.nghiem2());
        }
    }
}
