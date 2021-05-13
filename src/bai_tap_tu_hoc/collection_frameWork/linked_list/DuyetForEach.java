package bai_tap_tu_hoc.collection_frameWork.linked_list;

import java.util.LinkedList;

public class DuyetForEach {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("java");linkedList.add("C++");
        linkedList.add("PHP");linkedList.add("java");
        System.out.println("cac phan tu trong mang la:");
        for (String str: linkedList) {
            System.out.println(str);
        }
    }
}
