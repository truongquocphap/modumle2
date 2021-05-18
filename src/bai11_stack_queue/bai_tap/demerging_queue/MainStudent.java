package bai11_stack_queue.bai_tap.demerging_queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        ArrayList<Student> list1=new ArrayList<>();
        list.add(new Student("Tuan",34,"12/3/2011",7,"nam"));
        list.add(new Student("Ha",12,"13/3/1997",7,"nu"));
        list.add(new Student("Trang",34,"12/3/1889",7,"nu"));
        list.add(new Student("Thuy",5,"16/3/1995",7,"nu"));
        list.add(new Student("Quanng",12,"15/3/2000",7,"nam"));
        System.out.println("student ban dau");
        for (Student students: list) {
            System.out.println(students.toString());
        }

        Collections.sort(list,new ComparatorName());
        System.out.println("student sau khi sap xep theo ten");
        for (Student student:list) {
            System.out.println(student);
        }

        System.out.println("student sap xep theo nam sinh");
        Collections.sort(list,new ComparatorBirthday());
        for (Student students: list) {
            System.out.println(students);
        }
        Queue<Student> nu=new ArrayDeque<>();
        Queue<Student> nam=new ArrayDeque<>();
        for (Student students: list) {
            if (students.getGender().equals("nu")){
                nu.add(students);
            }else {
                nam.add(students);
            }
        }


        System.out.println("sap xep theo gioi tinh");
        list1.addAll(nu);
        list1.addAll(nam);
        for (Student students:list1) {
            System.out.println(students);
        }

    }
}
