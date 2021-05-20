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
            int a='d';
        for (int i = 0; i < chars.length; i++) {
            compare[i]=chars[i];
        }
//        int temp=compare[0];
        compare2[0]=compare[0];
        int count=1;
        System.out.println(compare[compare.length-1]);
        for (int i = 1; i < compare.length; i++) {

            if (compare[i]>compare2[count-1]){
                compare2[count]=compare[i];
                count++;
            }
//            for (int j = i+1; j < compare.length; j++) {
//                if (compare[i]>compare[j]){
//                    temp=compare[j];
//                    compare[j]=compare[i];
//                    compare[i]=temp;
//                }
//            }
        }
        char[] newChar=new char[count];
        for (int i = 0; i < count; i++) {
                newChar[i]=(char) compare2[i];
        }
        System.out.println("sap xep theo thu tu bang ascii la: ");
        String str=new String(newChar);
        System.out.println(str);
//        char[] newChar=new char[compare.length];
//        for (int i = 0; i < compare.length; i++) {
//            newChar[i]=(char) compare[i];
//        }
//        System.out.println("thứ  tự sắp xếp kí tự từ lớn đến nhỏ theo bảng mã ascii là :");
//       String str= new String(newChar);
//        System.out.println(str);


    }
}
