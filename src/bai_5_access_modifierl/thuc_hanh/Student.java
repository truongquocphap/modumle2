package bai_5_access_modifierl.thuc_hanh;

import bai_tap_tu_hoc.Studen;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";
    Student (int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    static void change(){
        college="CODEGYM";
    }
    void display(){
        System.out.println(this.rollno+" "+this.name+" "+college);
    }
    public static class TestStaticMethod{
        public static void main(String[] args) {
            Student.change();
            Student s1=new Student(111,"Chau");
            Student s2=new Student(111,"Phi");
            Student s3=new Student(111,"Phap");
            s1.display();
            s2.display();
            s3.display();

        }
    }


}

