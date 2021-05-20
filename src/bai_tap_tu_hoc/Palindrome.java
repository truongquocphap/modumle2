package bai_tap_tu_hoc;

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        String str2 = inputString.toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        if (str2.length()%2==0){
            for (int i = 0; i < str2.length()/2; i++) {
                queue.add(str2.charAt(i));
            }
            for (int i = str2.length()/2; i < str2.length(); i++) {
                stack.push(str2.charAt(i));
            }
        }else {
            for (int i = 0; i < (str2.length()-1)/2; i++) {
                queue.add(str2.charAt(i));
            }
            for (int i = (str2.length()-1)/2; i < str2.length(); i++) {
                stack.push(str2.charAt(i));
            }
        }

        for (int i = 0; i < str2.length()/2; i++) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Đây là chuỗi Palindrome!");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome!");
        }
    }
}
