package bai11_stack_queue.bai_tap.bracket;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi co chua dau ngoac de kiem tra");
        String expresion=scanner.nextLine();
        Stack<Character> tempStack=new Stack<>();
        Stack<String> stack1=new Stack<>();
        Stack<String> stack2=new Stack<>();
          char char1=')';
          char char2='(';
        for (int i = 0; i < expresion.length(); i++) {
            tempStack.push(expresion.charAt(i));
        }
        Character temp;
        for (int i = 0; i < expresion.length(); i++) {
            temp=tempStack.pop();
            if (temp.equals(char1)){
                stack1.push(")");
            }else if (temp.equals(char2)){
                stack2.push("(");
            }
        }
        if (stack1.size()==stack2.size()){
            System.out.println("check bracket is true");
        }else {
            System.out.println("check bracket is false");
        }
    }

}
