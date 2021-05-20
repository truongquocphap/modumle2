package bai13_thuat_toan_tim_kiem.baitap;

import java.util.*;

public class ChuoiLienTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi bat ki: ");
        String string = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> list1 = new LinkedList<>();
        for (int i = 1; i < string.length(); i++) {
            if (list.size() == 0) {
                if (list.size() < list1.size()) {
                    list.clear();
                }
               else if (string.charAt(i) > string.charAt(i - 1)) {
                    list.add(string.charAt(i - 1));
                    System.out.println(string.charAt(i - 1));

                }
            }
            else
                {

                for (int j = i + 1; j < string.length(); j++) {

                    if (string.charAt(j) > string.charAt(j - 1)) {
                        list1.add(string.charAt(j - 1));
                    } else if (list1.size() < list.size()) {
                        list1.clear();
                        i = j;
                        break;
                    }

                }
            }
        }
        System.out.println("chuoi lien tiep dai nhat la: ");
        if (list.size() > list1.size()) {
            for (Character showList : list) {
                System.out.println(showList);
            }

        } else {
            for (Character showList1 : list1) {
                System.out.println(showList1);
            }
        }
    }
}
