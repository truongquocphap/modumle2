package bai17_binaryFile.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct{
    List<Product> products = new ArrayList<>();
    public void addProduct() throws IOException {
        Scanner scanner = new Scanner(System.in);
            System.out.println("nhap so luong san pham muon them");
            int num = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < num; i++) {
                System.out.println("nhap id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap name: ");
                String name = scanner.nextLine();
                System.out.println("nhap manufacturer: ");
                String manufacturer = scanner.nextLine();
                System.out.println("nhap price: ");
                double price = Double.parseDouble(scanner.nextLine());
               products.add(new Product(id, name, manufacturer, price));
            }
        ReadAndWriteFileProduct.writeFileProduct(products);
    }
    public void showProduct() throws IOException {
       products= ReadAndWriteFileProduct.readProduct();
        System.out.println(products);
    }

}


