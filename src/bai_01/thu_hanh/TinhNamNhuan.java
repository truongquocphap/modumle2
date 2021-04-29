package bai_01.thu_hanh;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so nam de kiem tra co phai nam nhuan hay khong");
      int nam=  scanner.nextInt();
      if (nam%4==0&&nam%100!=0){
          System.out.println(nam+" la nam nhuan");
      }else if (nam%100==0&&nam%400!=0){
          System.out.println(nam+ " khong phai la nam nhuan");
      }else if (nam%100==0&&nam%400==0) {
          System.out.println(nam + " la nam nhuan");

      }else {
          System.out.println(nam+ " khong phai la nam nhuan");
      }
    }
}
