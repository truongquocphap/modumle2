package bai_01.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static String tu1Den9(int so) {
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
        }
        return hienThi;
    }

    public static String tu10Den19(int so) {
        String hienThi = "";
        switch (so) {
            case 0:
                hienThi = "ten";
            case 1:
                hienThi = "eleven";
                break;
            case 2:
                hienThi = "twelve";
                break;
            case 3:
                hienThi = "thirteen";
                break;
            case 4:
                hienThi = "fourteen";
                break;
            case 5:
                hienThi = "fifteen";
                break;
            case 6:
                hienThi = "sixteen";
                break;
            case 7:
                hienThi = "seventeen";
                break;
            case 8:
                hienThi = "eighteen";
                break;
            case 9:
                hienThi = "nineteen";
                break;

        }
        return hienThi;
    }

    public static String tu10Den90(int so) {
        String hienThi = "";
        switch (so) {
            case 1:
                hienThi = "ten";
                break;
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

    public static String tu100den900(int so) {
        String hienThi = "";
        switch (so) {
            case 1:
                hienThi = "one hundred";
                break;
            case 2:
                hienThi = "two hundred";
                break;
            case 3:
                hienThi = "three hundred";
                break;
            case 4:
                hienThi = "four hundred";
                break;
            case 5:
                hienThi = "fif hundred";
                break;
            case 6:
                hienThi = "six hundred";
                break;
            case 7:
                hienThi = "seven hundred";
                break;
            case 8:
                hienThi = "eight hundred";
                break;
            case 9:
                hienThi = "nine hundred";
                break;
        }
        return hienThi;
    }

    public static void main(String[] args) {
        System.out.println("nhap so can doc");
        Scanner scanner = new Scanner(System.in);
        int chuSo = scanner.nextInt();
        int soChiaHetCho10 = chuSo / 10;
        int chiaLayDu = chuSo % 10;
        int soChiaHetCho100 = chuSo / 100;
        int chiaLayDu100 = chuSo % 100;
        int chiaLayDuCua100 = chiaLayDu100 / 10;
        if (chuSo < 10) {
            System.out.println(tu1Den9(chuSo));
        } else if (chuSo <= 19) {
            System.out.println(tu10Den19(chiaLayDu));
        } else if (chuSo > 19 && chuSo <= 99) {
            if (soChiaHetCho10 <= 9 && chiaLayDu >= 1) {
                System.out.println(tu10Den90(soChiaHetCho10) + "-" + tu1Den9(chiaLayDu));
            }
        } else if (chuSo > 99 && chuSo < 1000) {

            if (soChiaHetCho100 < 10 && chiaLayDuCua100 >= 1 && chiaLayDu >= 1 && soChiaHetCho10 > 11) {
                System.out.println(tu100den900(soChiaHetCho100) + "-" + tu10Den90(chiaLayDuCua100) + " and " + tu1Den9(chiaLayDu));
            } else if (soChiaHetCho100 < 10 && chiaLayDuCua100 >= 1 && chiaLayDu >= 1) {
                System.out.println(tu100den900(soChiaHetCho100) + "  " + tu10Den19(chiaLayDu));
            } else if (soChiaHetCho100 < 10 && chiaLayDuCua100 >= 1) {
                System.out.println(tu100den900(soChiaHetCho100) + " " + tu10Den90(chiaLayDuCua100));
            } else if (soChiaHetCho100 < 10 && chiaLayDu < 10) {
                System.out.println(tu100den900(soChiaHetCho100) + " and " + tu1Den9(chiaLayDu));
            }
        } else if (soChiaHetCho100 <= 9) {
            System.out.println(tu100den900(soChiaHetCho100));
        }
    }

}

