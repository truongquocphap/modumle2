package bai17_binary.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManegerStudent implements Serializable {
    public static final String PATH="/Users/truongquocphap/Documents/codegym/module-02/module2/src/bai17_binary/thuchanh/data/";
    public static void writeToFile(String filePath, List<Student> students) throws IOException {
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(PATH+filePath);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        }finally {

            objectOutputStream.close();

            fileOutputStream.close();
        }
    }
    public static List<Student> readStudentFile(String filePath) throws IOException {
        List<Student> students=new ArrayList<>();
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            fileInputStream=new FileInputStream(PATH+filePath);
            objectInputStream =new ObjectInputStream(fileInputStream);
            students= (List<Student>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

            objectInputStream.close();

            fileInputStream.close();
        }
        return students;
    }


}
