package bai_12_collection_framework.thuchanh;

import java.util.*;

public class TestHashMapAndHashSet {
    public static void main(String[] args) {
        Map<Integer, Student> students=new HashMap<Integer, Student>();
      Student students1=new Student("Chau",14,"quang ngai");
        Student students2=new Student("Phi",12,"quang nam");
        Student students3=new Student("Phap",15,"dak lak");
        Student students4=new Student("Tuan",17,"gia lai");
        Student students5=new Student("Hoc",32,"quang tri");
       students.put(1,students1);
       students.put(2,students2);
       students.put(3,students3);
       students.put(4,students4);
       students.put(5,students5);
        students.put(0,students1);
//        System.out.println(students);
        for (Map.Entry<Integer, Student> student: students.entrySet()
             ) {
            System.out.println(student.toString());
        }
        System.out.println("HashSet-------------HashSet");
        Set<Student> listStudent=new HashSet<Student>();
        listStudent.add(students1);
        listStudent.add(students2);
        listStudent.add(students3);
        listStudent.add(students4);
        listStudent.add(students5);
        listStudent.add(students1);
        for (Student student:listStudent) {
            System.out.println(student.toString());
        }
        System.out.println("---------TreeMap");
        Map<Integer, Student> listStudentTreeMap=new TreeMap<>();
        listStudentTreeMap.put(1,students1);
        listStudentTreeMap.put(3,students2);
        listStudentTreeMap.put(5,students3);
        listStudentTreeMap.put(6,students4);
        listStudentTreeMap.put(9,students5);
        listStudentTreeMap.put(11,students1);
        for (Map.Entry<Integer, Student> student: listStudentTreeMap.entrySet()
             ) {
            System.out.println(student.getKey()+"-"+student.getValue());

        }
    }
}
