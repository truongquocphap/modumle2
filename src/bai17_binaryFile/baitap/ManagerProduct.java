package bai17_binaryFile.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct extends Product {

    private static final String PATH = "/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_binaryFile/baitap/productFile.csv";
//    public void writeProductFile( List<Product> products) throws IOException {
//
//    }


    public void addProduct() throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
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
                objectOutputStream.writeObject(new Product(id, name, manufacturer, price)+"\n");
                objectOutputStream.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }


    }

    public void readProduct() throws IOException {
        List<Product> products = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object line=null;
            while ((line = objectInputStream.readObject()) != null) {
                System.out.println(line);
                products.add((Product) line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
        } finally {
            objectInputStream.close();
            fileInputStream.close();
        }

//            for (int i = 0; i < products.size(); i++) {
//                System.out.println(products.get(i).toString());
//            }

    }

}
