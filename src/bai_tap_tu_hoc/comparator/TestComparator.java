package bai_tap_tu_hoc.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Student> listStudent=new ArrayList<Student>();
        listStudent.add(new Student(1,"hoa",23,"ha noi"));
        listStudent.add(new Student(1,"vinh",12,"ha noi"));
        listStudent.add(new Student(1,"anh",14,"ha noi"));
        listStudent.add(new Student(1,"dao",21,"ha noi"));
//        sort listStudent by it's name ASC
        System.out.println("sort listStudent by it's name ASC:  ");
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
//        show list student
        for (Student st: listStudent
             ) {
            System.out.println(st.toString());
        }
//        sort list student by it's age ASC
        System.out.println("sort list student by it's age ASC: ");
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()>o2.getAge() ? 1 : -1;
            }
        });
        for (Student st:listStudent
        ) {
            System.out.println(st.toString());
        }
    }

}
