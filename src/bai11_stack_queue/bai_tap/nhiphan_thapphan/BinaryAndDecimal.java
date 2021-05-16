package bai11_stack_queue.bai_tap.nhiphan_thapphan;

import java.util.Scanner;
import java.util.Stack;

public class BinaryAndDecimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao so de tim ra so nhi phan cua so do");
        int binary=scanner.nextInt();
        Stack<Integer> strBinary=new Stack<>();
        while (binary!=0){

            int temp=binary%2;
            strBinary.push(temp);
            binary/=2;

        }
        System.out.println(strBinary);
    }
}
