package bai11_stack_queue.bai_tap.swap_element;

import java.util.Scanner;
import java.util.Stack;

public class SwapElement {
    public static void main(String[] args) {
        Stack<String> swap=new Stack<>();
       swap.push("phap");
//       swap.push("phap");
//       swap.push("phap");
     String newSwap="";
       String str="";
        for (int i = 0; i <swap.size() ; i++) {
           str+= swap.get(i);
            System.out.println(swap.get(i));
        }
        System.out.println("tach chuoi string");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("swap chuoi string");
        for (int i = str.length()-1; i >=0 ; i--) {
            newSwap+=str.charAt(i);
//            System.out.println(newSwap.charAt(i));
        }
        System.out.println(newSwap);
    }
}
