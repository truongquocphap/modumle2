package bai17_binaryFile.bai_tap;

import java.io.*;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacturer;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, double price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                 id +
                "-" +name +
                "-" + manufacturer +
                "-" + price+"\n"
                ;
    }
//    private static final String PATH="/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_binary/baitap/";
//    public static void writeProductFile(String filePath, List<Product> products) throws IOException {
//        FileOutputStream fileOutputStream=null;
//        ObjectOutputStream objectOutputStream=null;
//        try{
//            fileOutputStream=new FileOutputStream(PATH+filePath);
//            objectOutputStream=new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(products);
//            objectOutputStream.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//        }finally {
//            objectOutputStream.close();
//            fileOutputStream.close();
//        }
//    }
}
