package bai_01.thu_hanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float Width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter Width:");
        Width =scanner.nextFloat();
        System.out.println("enter Height:");
        height=scanner.nextFloat();
        float area=Width*height;
        System.out.println("Area is:"+area);
    }
}
