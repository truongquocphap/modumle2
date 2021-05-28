package bai16_reader_write.bai_tap;

import java.util.Scanner;

public class MainCopyFileText {
    public static void main(String[] args) {
        CopyFileText fileText = new CopyFileText();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap duong dan file read");
        String fileRead = scanner.nextLine();
        System.out.println("nhap duong dan file writer");
        String fileWriter=scanner.nextLine();
        fileText.readerAndWriteFile(fileRead,fileWriter,true);
    }
}
