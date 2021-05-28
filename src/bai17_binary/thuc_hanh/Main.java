package bai17_binary.thuc_hanh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        ManegerStudent.writeToFile("student.txt", students);
        ManegerStudent.readStudentFile("student.txt");
        for (Student st:students
             ) {
            System.out.println(st);
        }
    }

}
