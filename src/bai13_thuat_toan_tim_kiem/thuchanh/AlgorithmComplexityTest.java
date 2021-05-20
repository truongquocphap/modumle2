package bai13_thuat_toan_tim_kiem.thuchanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string: ");
        String input= scanner.nextLine();
        int [] frequentChar=new int[255];
        for (int i = 0; i < input.length(); i++) {
            int ascii=(int) input.charAt(i);
            frequentChar[ascii]+=1;
        }

        int max=0;
        char character=(char) 255;

        for (int i = 0; i < 255; i++) {
            if (frequentChar[i]>max){
                max=frequentChar[i];
                character=(char) i;
            }


        }
        System.out.println("the most appearing letter is: "+character+" " +
                "with a frequency of  "+ max +" times");
    }
}
