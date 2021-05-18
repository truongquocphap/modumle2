package bai_12_collection_framework.thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompare {
    public static void main(String[] args) {
        ComparableStudentName student1=new ComparableStudentName("phap",12,"quang ngai");
        ComparableStudentName student2=new ComparableStudentName("chau",23,"quang nam");
        ComparableStudentName student3=new ComparableStudentName("chi",11,"quang tri");
        ComparableStudentName student4=new ComparableStudentName("quang",4,"quang binh");
        List<ComparableStudentName> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println("sap xep theo tuoi");
        Collections.sort(studentList,new ComparatorAge());
        for (ComparableStudentName st: studentList) {
            System.out.println(st.toString());
        }
        System.out.println("sap xep theo ten");

        Collections.sort(studentList);
        for (ComparableStudentName student :studentList) {
            System.out.println(student.toString());
        }
    }
}
