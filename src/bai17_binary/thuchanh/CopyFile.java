package bai17_binary.thuchanh;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
//    public static final String PATH="/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_binary/thuchanh/data/";
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap source file");
        String source=scanner.nextLine();
        System.out.println("nhap destination file: ");
        String dest=scanner.nextLine();
        File sourceFile=new File(source);
        File destFile=new File(dest);
        try{
//            copyFileUsingJava7Files(sourceFile,destFile);
            copyFileStream(sourceFile,destFile);
        } catch (IOException e) {
            System.out.println("can't copy not file");
            System.out.println(e.getMessage());
        }

    }
}

