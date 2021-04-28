package bai_01_baiTap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static String tu1Den19(int so) {
        String hienThi = "";
        switch (so) {
            case 1:
                hienThi = "one";
                break;
            case 2:
                hienThi = "two";
                break;
            case 3:
                hienThi = "three";
                break;
            case 4:
                hienThi = "four";
                break;
            case 5:
                hienThi = "five";
                break;
            case 6:
                hienThi = "six";
                break;
            case 7:
                hienThi = "seven";
                break;
            case 8:
                hienThi = "eight";
                break;
            case 9:
                hienThi = "nine";
                break;
            case 10:
                hienThi = "ten";
                break;
            case 11:
                hienThi = "eleven";
                break;
            case 12:
                hienThi = "twelve";
                break;
            case 13:
                hienThi = "thirteen";
                break;
            case 14:
                hienThi = "fourteen";
                break;
            case 15:
                hienThi = "fifteen";
                break;
            case 16:
                hienThi = "sixteen";
                break;
            case 17:
                hienThi = "seventeen";
                break;
            case 18:
                hienThi = "eighteen";
                break;
            case 19:
                hienThi = "nineteen";
                break;

        }
        return hienThi;
    }

    public static String tu20Den90(int so) {
        String hienThi = "";
        switch (so) {
            case 2:
                hienThi = "twenty";
                break;
            case 3:
                hienThi = "thirty";
                break;
            case 4:
                hienThi = "fourty";
                break;
            case 5:
                hienThi = "fifty";
                break;
            case 6:
                hienThi = "sixty";
                break;
            case 7:
                hienThi = "seventy";
                break;
            case 8:
                hienThi = "eighty";
                break;
            case 9:
                hienThi = "ninety";
                break;
        }
        return hienThi;

    }
    public static String tu100den900(int so){
        String hienThi="";
        switch (so){
            case 1:
                hienThi="one hundred";
                break;
            case 2:
                hienThi="two hundred";
                break;
            case 3:
                hienThi="three hundred";
                break;
            case 4:
                hienThi="four hundred";
                break;
            case 5:
                hienThi="fif hundred";
                break;
            case 6:
                hienThi="six hundred";
                break;
            case 7:
                hienThi="seven hundred";
                break;
            case 8:
                hienThi="eight hundred";
                break;
            case 9:
                hienThi="nine hundred";
                break;

        }
        return hienThi;
    }

    public static void main(String[] args) {
        System.out.println("nhap so can doc");
        Scanner scanner = new Scanner(System.in);
        int chuSo = scanner.nextInt();
        int soChiaHetCho10=chuSo/10;
        int chiaLayDu=chuSo%10;
        int soChiaHetCho100=chuSo/100;
        int soChiaHetCho110=chuSo/110;

        if (chuSo < 20) {
            System.out.println(tu1Den19(chuSo));
        }else if(soChiaHetCho100>=1 && soChiaHetCho110>=2 && chiaLayDu>=1){
            System.out.println(tu100den900(soChiaHetCho100)+"-"+tu20Den90(soChiaHetCho110)+" and "+tu1Den19(chiaLayDu));
        }
        else if (soChiaHetCho100<=9 && soChiaHetCho110<=9){
            System.out.println(tu100den900(soChiaHetCho100)+"-"+tu20Den90(soChiaHetCho110));
        }
        else if (soChiaHetCho10<=9 && chiaLayDu<=9){
            System.out.println(tu20Den90(soChiaHetCho10)+"-"+tu1Den19(chiaLayDu));
        }
        else
        if (soChiaHetCho10<=9) {
            System.out.println(tu20Den90(soChiaHetCho10));
        }else if (soChiaHetCho100<=9){
            System.out.println(tu100den900(soChiaHetCho100));
        }
    }
}
