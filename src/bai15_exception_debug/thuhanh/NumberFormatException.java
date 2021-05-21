package bai15_exception_debug.thuhanh;

import java.util.Scanner;

public class NumberFormatException {
    private void calculate(int x,int y){
        try{
            int a=x+y;
            int b=x-y;
            int c= x*y;
            int d=x/y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }catch (Exception e){
            System.out.println("error : "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap x");
        int x=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap y:");
        int y= Integer.parseInt(scanner.nextLine());
        NumberFormatException number=new NumberFormatException();
        number.calculate(x,y);
    }
}
