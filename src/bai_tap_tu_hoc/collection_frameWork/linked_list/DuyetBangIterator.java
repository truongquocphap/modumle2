package bai_tap_tu_hoc.collection_frameWork.linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class DuyetBangIterator {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("java");linkedList.add("C++");
        linkedList.add("PHP");linkedList.add("java");
        Iterator<String> iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println((String) iterator.next());
        }
    }
}
