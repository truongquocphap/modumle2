package bai_02_vong_lap.bai_tap;

import java.util.Scanner;

public class MenuVeHinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nhapSo=-1;
        while (nhapSo!=5){
            System.out.println("1: in hinh chu nhat");
            System.out.println("2: in hinh vuong");
            System.out.println("3: in hinh tam giac vuong 1");
            System.out.println("4: in hinh tam giac vuong 2");
            System.out.println("5: thoat");
            System.out.println("nhap vao so thu tu theo hinh muon ve");
            nhapSo = scanner.nextInt();

            switch (nhapSo){
                case 1:
                    String hinh1="";
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 8; j++) {
                            hinh1+="*";
                        }
                        hinh1+="\n";
                    }
                    System.out.println(hinh1);
                    break;
                case 2:
                    String hinh2="";
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            hinh2+="*";
                        }
                        hinh2+="\n";
                    }
                    System.out.println(hinh2);
                    break;
                case 3:
                    String hinh3="";
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8-i; j++) {
                            hinh3+="*";
                        }
                        hinh3+="\n";
                    }
                    System.out.println(hinh3);
                    break;
                case 4:
                    String hinh4="";
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < i+1; j++) {
                            hinh4+="*";
                        }
                        hinh4+="\n";
                    }
                    System.out.println(hinh4);
                    break;
                case 5:
                    System.exit(5);
                default:
                    break;
            }
        }
    }
}
