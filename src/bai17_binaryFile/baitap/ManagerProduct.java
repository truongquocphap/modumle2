package bai17_binaryFile.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct extends Product  {
    List<Product> products= new ArrayList<>();
    public Scanner scanner(){
        Scanner scanner=new Scanner(System.in);
        return scanner;
    }
    private static final String PATH="/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_binary/baitap/productFile.csv";
    public void writeProductFile( List<Product> products) throws IOException {
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(PATH,true);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);

            for (Product pro: products) {
                objectOutputStream.writeObject(products);

            }
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        }finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }


    public void addProduct() throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so luong san pham muon them");
        int num= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("nhap id: ");
            int id=Integer.parseInt(scanner.nextLine());
            System.out.println("nhap name: ");
            String name=scanner.nextLine();
            System.out.println("nhap manufacturer: ");
            String manufacturer=scanner.nextLine();
            System.out.println("nhap price: ");
            double price=Double.parseDouble(scanner.nextLine());
            Product product=new Product(id,name,manufacturer,price);
            products.add(product);
            writeProductFile(products);
        }

    }
    public List<Product> readProduct() throws IOException {
        List<Product> products=new ArrayList<>();
    FileInputStream fileInputStream=null;
    ObjectInputStream objectInputStream=null;
    try{
        fileInputStream=new FileInputStream(PATH);
        objectInputStream=new ObjectInputStream(fileInputStream);
        products = (List<Product>) objectInputStream.readObject();


    } catch (FileNotFoundException | ClassNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
    }finally {
        objectInputStream.close();
        fileInputStream.close();
    }
return products;
    }
//    public void showProduct() throws IOException {
//        for (int i = 0; i < readProduct().size(); i++) {
//            System.out.println(readProduct());
//        }
//
//    }

}
