package bai_tap_tu_hoc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ManagerStudent extends Student {
    List<Student> studentList = new ArrayList<>();


    Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.println("nhap so sinh vien can them");
        int n;
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("input ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < studentList.size(); j++) {
                if (studentList.get(j).getId() == id) {
                    while (studentList.get(j).getId() == id) {
                        System.out.println("id da bi trung voi id trong danh sach moi nhap lai");
                        id = Integer.parseInt(scanner.nextLine());
                    }
                }
            }
            System.out.println("input name:");
            String name = scanner.nextLine();
            System.out.println("input age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("input address:");
            String address = scanner.nextLine();
            System.out.println("input gpa: ");
            double gpa = Double.parseDouble(scanner.nextLine());
            Student student = new Student(id, name, age, address, gpa);
            studentList.add(student);
        }
    }

    public void edit() {
        System.out.println("nhap id sinh vien can sua:");
        int id = scanner.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                System.out.println("input name:");
                String name = scanner.nextLine();
                studentList.get(i).setName(name);
                System.out.println("input age:");
                int age = Integer.parseInt(scanner.nextLine());
                studentList.get(i).setAge(age);
                System.out.println("input address:");
                String address = scanner.nextLine();
                studentList.get(i).setAddress(address);
                System.out.println("input gpa: ");
                double gpa = Double.parseDouble(scanner.nextLine());
                studentList.get(i).setGpa(gpa);
            }
        }
    }

    public void delete() {
        System.out.println("nhap id sinh vien can xoa:");
        int deleteId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == deleteId) {
                studentList.remove(studentList.get(i));
                break;
            }
        }
    }

    public void sortGpa() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGpa() < o2.getGpa()) {
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }
    public void sortName(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }


    public void display() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }

    }
    public void outputStream(){
        FileOutputStream fos = null;
        ObjectOutputStream oos=null;
        try{
            fos= new FileOutputStream("student.data");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(studentList);

        }catch (Exception e){

        }
        finally {
            try{
                if (fos!=null){
                    fos.close();
                }
                if (oos!=null){
                    oos.close();
                }
            } catch (Exception e) {
            }
        }
    }
    public void inputStream(){
        //                    doc du lieu tu file
        FileInputStream fis = null;
        ObjectInputStream ois=null;
        try{
            fis= new FileInputStream("student.data");
            ois=new ObjectInputStream(fis);
            studentList= (List<Student>) ois.readObject();

        }catch (Exception e){

        }
        finally {
            try{
                if (fis!=null){
                    fis.close();
                }
                if (ois!=null){
                    ois.close();
                }
            } catch (Exception e) {
            }
        }
    }

}
