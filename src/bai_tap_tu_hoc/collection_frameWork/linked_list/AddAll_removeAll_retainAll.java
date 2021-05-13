package bai_tap_tu_hoc.collection_frameWork.linked_list;

import java.util.LinkedList;

public class AddAll_removeAll_retainAll {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("java");linkedList.add("C++");
        linkedList.add("PHP");linkedList.add("java");
        System.out.println("su dung addAll()");
//        them cac phan tu vao danh sach
        LinkedList<String> listA=new LinkedList<String>();
        listA.addAll(linkedList);
        System.out.println("listA :");
        showList(listA);


        System.out.println("su dung retainAll:");
        LinkedList<String> listB=new LinkedList<String>();
        listB.add("java");
//        xoa phan tu k thuoc list b khoi list a.chi giu lai phan tu chi dinh
        listA.retainAll(listB);
        System.out.println("listA: ");
        showList(listA);
//        removeAll.xao phan tu thuoc trong DS.
        System.out.println("removeAll");
        linkedList.removeAll(listB);
        showList(linkedList);


    }
    public static void showList(LinkedList<String> linkedList){
        for (String str : linkedList
             ) {
            System.out.println("\t"+str+" , ");
        }
        System.out.println();
    }
}
