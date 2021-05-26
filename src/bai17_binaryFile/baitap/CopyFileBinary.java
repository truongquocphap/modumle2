package bai17_binaryFile.baitap;

import java.io.*;
import java.util.Scanner;

public class CopyFileBinary implements Serializable{
    public static void main(String[] args) throws IOException {

        final String PATH = "/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_binaryFile/baitap/";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap file source");
        String sourceFile = scanner.nextLine();
        System.out.println("nhap file target");
        String targetFile = scanner.nextLine();
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileInputStream = new FileInputStream(PATH + sourceFile);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            fileOutputStream = new FileOutputStream(PATH + targetFile);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] data = new byte[1024];
            int length = bufferedInputStream.read(data);
            int i = -1;
            for (int j = 0; j < length; j++) {
                byte newByte= (byte) data[j];
                bufferedOutputStream.write(newByte);
                System.out.println((char) newByte);
            }
            System.out.println("length: "+length);
            bufferedOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } finally {
            bufferedOutputStream.close();
            fileOutputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
        }
    }
}
