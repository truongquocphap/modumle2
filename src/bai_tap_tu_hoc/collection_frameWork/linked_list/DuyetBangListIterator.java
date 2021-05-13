package bai_tap_tu_hoc.collection_frameWork.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;
public class DuyetBangListIterator {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("java");linkedList.add("C++");
        linkedList.add("PHP");linkedList.add("java");
        ListIterator<String> list=linkedList.listIterator();
        while (list.hasNext()){
            System.out.println((String) list.next());
        }
    }
}
