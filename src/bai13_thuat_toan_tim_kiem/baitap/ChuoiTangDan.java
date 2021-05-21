package bai13_thuat_toan_tim_kiem.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi");
        String string=scanner.nextLine();
        char[] chars=string.toCharArray();
        int[] compare=new int[string.length()];
        int[] compare2=new int[string.length()];
        for (int i = 0; i < chars.length; i++) {
            compare[i]=chars[i];
        }
        compare2[0]=compare[0];
        int count=1;
        System.out.println(compare[compare.length-1]);
        for (int i = 1; i < compare.length; i++) {

            if (compare[i]>compare2[count-1]){
                compare2[count]=compare[i];
                count++;
            }
        }
        char[] newChar=new char[count];
        for (int i = 0; i < count; i++) {
                newChar[i]=(char) compare2[i];
        }
        System.out.println("sap xep theo thu tu bang ascii la: ");
        String str=new String(newChar);
        System.out.println(str);
    }
}
