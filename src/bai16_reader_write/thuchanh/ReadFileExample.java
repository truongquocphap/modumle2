package bai16_reader_write.thuchanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static final String PATH="/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_reader_write/thuchanh/data/";
    public static void readFileText(String filePath) throws IOException {
        BufferedReader bufferedReader=null;
        File file=null;
        FileReader fileReader=null;
        try{
//            tao file theo duong dan
            file=new File(PATH+filePath);
//            kiem tra nieu file k ton ta.
            if (!file.exists()){
                file.createNewFile();
            }
            fileReader=new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line="";
            int sum=0;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println("file khong ton tai hoac noi dung co loi");
        } finally {
            if (bufferedReader!=null)
            bufferedReader.close();
            if (fileReader!=null)
                fileReader.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap duong dan link");
        String path=scanner.nextLine();
       readFileText(path);
    }
}
