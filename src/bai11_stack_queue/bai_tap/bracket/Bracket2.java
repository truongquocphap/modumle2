package bai11_stack_queue.bai_tap.bracket;

import java.util.Stack;

public class Bracket2 {
    public static void main(String[] args) {
        String str = "s * (s – a( * (s – b( * )s – c))";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (str.charAt(i) == ')') {
                stack.push(str.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
    }
}
