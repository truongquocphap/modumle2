package bai_10_baitap.mylist;

public class TestArrayList {
    public static void main(String[] args) {
        MyArrayList<String> student=new MyArrayList<>();
        student.add("phap");
        student.add("chau");
        student.add("hai");
        student.add("cun");
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
        System.out.println("method add index");
        student.add("quan",2);
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
        System.out.println("method clone()");
        MyArrayList<String> newList=student.clone();
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
    }
}
