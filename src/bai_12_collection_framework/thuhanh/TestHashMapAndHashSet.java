package bai_12_collection_framework.thuhanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashMapAndHashSet {
    public static void main(String[] args) {
        Map<Integer,HashSetAndHashMap> students=new HashMap<Integer, HashSetAndHashMap>();
      HashSetAndHashMap  students1=new HashSetAndHashMap("Chau",14,"quang ngai");
        HashSetAndHashMap students2=new HashSetAndHashMap("Phi",12,"quang nam");
        HashSetAndHashMap students3=new HashSetAndHashMap("Phap",15,"dak lak");
        HashSetAndHashMap students4=new HashSetAndHashMap("Tuan",17,"gia lai");
        HashSetAndHashMap students5=new HashSetAndHashMap("Hoc",32,"quang tri");
       students.put(1,students1);
       students.put(2,students2);
       students.put(3,students3);
       students.put(4,students4);
       students.put(5,students5);
        students.put(6,students1);
//        System.out.println(students);
        for (Map.Entry<Integer,HashSetAndHashMap> student: students.entrySet()
             ) {
            System.out.println(student.toString());
        }
        System.out.println("set-------------set");
        Set<HashSetAndHashMap> listStudent=new HashSet<HashSetAndHashMap>();
        listStudent.add(students1);
        listStudent.add(students2);
        listStudent.add(students3);
        listStudent.add(students4);
        listStudent.add(students5);
        listStudent.add(students1);
        for (HashSetAndHashMap student:listStudent) {
            System.out.println(student.toString());
        }
    }
}
