package bai13_thuat_toan_tim_kiem.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLienTiep2 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("nhap chuoi bat ki: ");
        String string = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> list1 = new LinkedList<>();
        int count2=0;
        for (int i=0; i <string.length() ; i++) {


            for (int j = i+1; j <string.length() ; j++) {
                if  (string.charAt(j) > string.charAt(j - 1)) {
                    list.add(string.charAt(j - 1));
                    System.out.println("list "+string.charAt(j-1));
                }else {
                    i=j;
                    break;
                }
            }
            for (int j = i+1; j <string.length() ; j++) {
                if (string.charAt(j)>string.charAt(j-1)){
                    list1.add(string.charAt(j-1));
                    System.out.println("list1 "+string.charAt(j-1));
                }else {
                    i=j;
                    break;
                }
            }

            if (list.size()>list1.size()){
                i = getI(string, list1, i);
            }else {
                i = getI(string, list, i);
            }

        }
        if (list.size()>list1.size()){
            System.out.println(list);
        }else {
            System.out.println(list1);
        }

    }

    private static int getI(String string, LinkedList<Character> list, int i) {
        list.clear();
        for (int j = i+1; j < string.length(); j++) {
            if  (string.charAt(j) > string.charAt(j - 1)) {
                list.add(string.charAt(j - 1));
            }else {
                i=j;
                break;
            }
        }
        return i;
    }
}
