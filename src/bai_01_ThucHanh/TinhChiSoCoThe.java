package bai_01_ThucHanh;

import java.util.Scanner;

public class TinhChiSoCoThe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap can nang cua co the");
        double weight=scanner.nextDouble();
        System.out.println("nhap chieu cao cua co the");
        double height=scanner.nextFloat();
        double BMI=weight/Math.pow(height,2);
        if (BMI<18.5){
            System.out.println("Interpretation");
        }else if (BMI<=25){
            System.out.println("Normal");
        }else if (BMI<=30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
