package bai_tap_tu_hoc.collection_frameWork.linked_list;

import java.util.LinkedList;

public class Add {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("java");linkedList.add("C++");
        linkedList.add("PHP");linkedList.add("java");
        System.out.println("cac phan tu trong list la: ");
        System.out.println(linkedList);
    }
}
