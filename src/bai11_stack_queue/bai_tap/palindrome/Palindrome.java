package bai11_stack_queue.bai_tap.palindrome;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi de kiem tra doi xung");
        String string=scanner.nextLine();
        Stack<Character> stackStr=new Stack<>();
        Queue<Character> queueStr=new ArrayDeque<>();
        Character temp1;
        Character temp2;
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            stackStr.push(string.charAt(i));
            queueStr.add(string.charAt(i));
        }
        System.out.println(stackStr);
        for (int i = 0; i <string.length() ; i++) {
           temp1=stackStr.pop();
           temp2=queueStr.remove();
           if (temp1==temp2){
               if (count==string.length()/2){
                   System.out.println(string+"la chuoi doi xung ");
               }
                   count++;
           }else {
               System.out.println(string+ " khong phai la chuoi doi xung");
               break;
           }


        }
    }
}
