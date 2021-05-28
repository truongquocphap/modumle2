package bai16_reader_write.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static final String PATH="/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_reader_write/thuchanh/data/";
    public List<Integer> readFile(String filePath) throws IOException {
        List<Integer> list=new ArrayList<>();
        File file;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            file=new File(PATH+filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            fileReader=new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                list.add(Integer.parseInt(line));
//                System.out.println(line);
            }

        } catch (Exception e) {
            System.err.println("file khong ton tai or noi dung loi");
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (Exception e){
                e.printStackTrace();
            }
//            if (bufferedReader!=null)
//            bufferedReader.close();
//            if (fileReader!=null)
//            fileReader.close();
        }
        return list;
    }
    public void writeFile(String filePath,boolean status,String max) throws IOException {

        File file=null;
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            file=new File(PATH+filePath);
            fileWriter = new FileWriter(file,status);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(max);

            bufferedWriter.newLine();
            bufferedWriter.flush();
//            {
//                //            bufferedWriter=new BufferedWriter(fileWriter);
//            fileWriter.write("gia tri lon nhat la: " + max);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //            if (bufferedWriter!=null)
//                bufferedWriter.close();
    }
    public  int findMax(List<Integer> number){
        int max=number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i)>max){
                max=number.get(i);
            }
        }
        return max;
    }
}
