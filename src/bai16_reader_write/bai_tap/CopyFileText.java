package bai16_reader_write.bai_tap;

import java.io.*;

public class CopyFileText {
    public static String PATH = "/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_reader_write/baitap/data/";

    public void readerAndWriteFile(String inputFile, String outputFile, boolean status) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;


        File file1 = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH + inputFile);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            int line;
            file1 = new File(PATH + outputFile);
            fileWriter = new FileWriter(file1, status);
            bufferedWriter = new BufferedWriter(fileWriter);
            int length = 0;
            while ((line = bufferedReader.read()) != -1) {
                bufferedWriter.write(line);
                length++;
            }
            System.out.println("tong so tu co trong file la: " + length);
        } catch (IOException e) {
            System.out.println("tin nguon da ton tai or tin dich da ton tai");
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
