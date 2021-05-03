package bai_tap_tu_hoc;

import java.util.Scanner;

public class KIemTraSo {
    public static int nhap(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" nhap vao so de kiem tra");
            try{
                n= input.nextInt();
                check= true;
            }
            catch(Exception e){
                System.err.println("Giá trị phải là số, hãy nhập lại...");
                input.nextLine();
            }
        }
        return (n);
    }
    public static void main(String[] args) {
            nhap();
    }
}
