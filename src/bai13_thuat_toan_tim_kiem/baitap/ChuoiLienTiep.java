package bai13_thuat_toan_tim_kiem.baitap;

import java.util.*;

public class ChuoiLienTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi bat ki: ");
        String string = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> list1 = new LinkedList<>();
        char[] chars = string.toCharArray();
        int[] compare = new int[string.length()];
        int[] compare2 = new int[string.length()];
        int a = 'd';
        for (int i = 0; i < chars.length; i++) {
            compare[i] = chars[i];
        }
//        int temp=compare[0];
        compare2[0] = compare[0];
        int count = 1;
        System.out.println(compare[compare.length - 1]);
        for (int i = 1; i < compare.length; i++) {

            if (compare[i] > compare2[i - 1]) {
                compare2[count] = compare[i];
                list.add((char) compare[i]);
                count++;
            }else {

            }
        }
    }
}
