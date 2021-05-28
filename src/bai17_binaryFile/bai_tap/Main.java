package bai17_binaryFile.bai_tap;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ManagerProduct products=new ManagerProduct();
        Scanner scanner=new Scanner(System.in);

        while (true){

            System.out.println("menu");

            System.out.println("1. add product " +
                    "2. show product" +
                    "0. exit");
           int  num =Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    products.addProduct();
                    break;
                case 2:
                    products.showProduct();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhap sai dinh dang");
            }
        }
    }
}
