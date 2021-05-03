package bai_02_vong_lap.thu_hanh;

import java.util.Scanner;

public class UngDungMenu {
//    public void check(){
//        System.out.println("GGGG");
//    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=-1;
        while (num!=0){
            System.out.println("Menu");
            System.out.println("1: ve hinh tam giac");
            System.out.println("2: ve hinh vuong");
            System.out.println("3: ve hinh binh hanh");
            System.out.println("0: exit");
            System.out.println("nhap vao so tuong tu de vex hinh");
            num=input.nextInt();
            switch (num){
                case 1:
                    System.out.println("hinh tam giac: ");
                    System.out.println("* * * * *");
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("hinh vuong");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("hinh chu nhat");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("hinh khong nam trong ung dung");
            }
        }
    }
}
