package bai16_reader_write.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCountriesFile {

    public static final String PATH="/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai16_reader_write/baitap/data/";
    public static List<String[]> readFile(String filePath){
        File file=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        List<String[]> strings=new ArrayList<>();
        try{
            file=new File(PATH+filePath);
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                strings.add(line.split(","));
//                System.out.println(line.split(",")[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" file khong ton tai or da trung file");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return strings;
    }
}
