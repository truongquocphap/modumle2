package bai_10_list.thuc_hanh.linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/=/=/=");
        MyLinkedList list=new MyLinkedList(10);
        list.addFirst(32);
        list.addFirst(12);
        list.addFirst(34);

        list.add(3,45);
        list.add(9,45);
        list.printList();
    }
}
