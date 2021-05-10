package bai_tap_tu_hoc.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestComparable {

    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<Student>();
//        add list student
        studentList.add(new Student(1,"vinh",19,"hanoi"));
        studentList.add(new Student(1,"hoa",19,"quangngai"));
        studentList.add(new Student(1,"cong",19,"hanoi"));
        studentList.add(new Student(1,"anh",19,"quang nam"));
//        sort list student
        Collections.sort(studentList);
        for (Student students: studentList
             ) {
            System.out.println(students.toString());
        }
    }
}
