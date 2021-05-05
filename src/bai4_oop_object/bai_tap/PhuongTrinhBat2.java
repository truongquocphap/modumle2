package bai4_oop_object.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBat2 {
    private double a;
    private double b;
    private double c;
    public PhuongTrinhBat2() {

    }
    public PhuongTrinhBat2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public void giaiPT() {
        if (this.kiemTraNghiem() < 0) {
            System.out.println("phương trình vô nghiệm ");
        } else if (this.kiemTraNghiem() == 0) {
            System.out.println("phương trình bật 2 có nghiệm kép :" + this.nghiemKep());

        } else {
            System.out.println("phương trình có 2 nghiệm: \n" +
                    "nghiệm thứ nhất :" + this.nghiem1() +
                    "\n nghiệm thứ hai :" + this.nghiem2());
        }

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
        phuongTrinhBat2.giaiPT();

    }
}
