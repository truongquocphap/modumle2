package bai17_binaryFile.bai_tap;

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
        ReadAndWrite(PATH, sourceFile, targetFile);
    }

    private static void ReadAndWrite(String PATH, String sourceFile, String targetFile) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {

            fileInputStream = new FileInputStream(PATH + sourceFile);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            File file=new File(PATH+targetFile);
            if (!file.exists()){
                System.out.println("file nay da ton tai");
            }
            fileOutputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);



            byte[] data = new byte[1024];
            int length = bufferedInputStream.read(data);
            for (int j = 0; j < length; j++) {
                byte newByte= (byte) data[j];
                bufferedOutputStream.write(newByte);
//                System.out.println((char) newByte);
            }
            System.out.println("length: "+length);
            bufferedOutputStream.flush();
        } catch (FileNotFoundException e) {
            System.out.println("tap tin nguon khong ton tai");
        } catch (IOException e) {
        } finally {
            bufferedOutputStream.close();
            fileOutputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
        }
    }
}
