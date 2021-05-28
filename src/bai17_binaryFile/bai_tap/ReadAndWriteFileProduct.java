package bai17_binaryFile.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadAndWriteFileProduct {
    private static final String PATH = "/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_binaryFile/bai_tap/productFile.data";

    public static void writeFileProduct(List<Product> products) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
        } finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }

    public static List<Product> readProduct() throws IOException {
List<Product> productList=new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> products = (List<Product>) objectInputStream.readObject();
            productList=products;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            objectInputStream.close();
            fileInputStream.close();
        }
        return  productList;
    }
}