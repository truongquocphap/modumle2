package bai11_stack_queue.bai_tap.count_number;

import java.util.*;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi ki tu de kiem tra cac ki tu co trong chuoi ban vua nhap");
        String str1 = scanner.nextLine();
        Map<Character, Integer> checkString1 = new TreeMap<Character, Integer>();
//        List<Character> list = new ArrayList<>();
//        for (int i = 0; i < str1.length(); i++) {
//            list.add(str1.charAt(i));
//        }
        for (int i = 0; i < str1.length(); i++) {
           if (checkString1.containsKey(str1.charAt(i))){
               checkString1.put(str1.charAt(i),checkString1.get(str1.charAt(i))+1);
           }else {
               checkString1.put(str1.charAt(i),1);
           }
        }
    System.out.println(checkString1);
    }
}
