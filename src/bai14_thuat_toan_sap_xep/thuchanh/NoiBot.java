package bai14_thuat_toan_sap_xep.thuchanh;

import java.util.Scanner;

public class NoiBot {
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("swap " + list[j] + " with " + list[j + 1]);

                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }

            }

            if (!needNextPass) {
                System.out.println("array may be sorted and next pass not needed ");
            break;
            }
            System.out.println("list after the "+ i + " sort : ");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j]+"\t");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang");
        int size=Integer.parseInt(scanner.nextLine());
        int[] list=new int[size];
        System.out.println("enter "+list.length+ "values: ");
        for (int i = 0; i < list.length; i++) {
            list[i]=Integer.parseInt(scanner.nextLine());
        }


        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);

    }
}
