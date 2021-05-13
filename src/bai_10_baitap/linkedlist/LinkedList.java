package bai_10_baitap.linkedlist;

public class LinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //    phan tu dau tien trong danh sach:head
    private Node head;
    //    so luong phan tu dau tien la 0
    private int numNode = 0;

    public LinkedList() {
    }

    public void addFist(E element) {
//        khai bao 1 bien temp de tro den gia tri cua head
        Node temp = head;
//        bien head se nhan gia tri la node moi;
        head = new Node(element);
//        head.next tro den temp
        head.next = temp;
        numNode++;
    }

    public void addLast(E element) {
//        khai bao bien temp de tro den head
        Node temp = head;
//        cho con tro chay den phan tu cuoi cung
        while (temp.next != null) {
            temp = temp.next;
        }
//        ep doi tuong element vao Npde
        temp = new Node(element);
        numNode++;
    }

    public void add(int index, E element) {
//        khai bao bien tem de tro den heap
        Node temp = head;
//        khan bao 1 node holder
        Node holder;
//        cho con tro chay den phan tu index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
//        cho holder tham chieu den vi tri index;
        holder = temp.next;
//        node tai vi tri index -1 se tro toi node moi
        temp.next = new Node(element);
//        node moi se tro den holder
        temp.next.next = holder;
//        tang so luong danh sanh len 1;
        numNode++;

    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNode;
    }

    public E remove(int index) {
        if (index < 0 || index > numNode) {
            throw new IndexOutOfBoundsException(" error index " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNode--;

        }
        return (E) data;
    }

    public boolean remove(E element) {
//        remove doi tuong neu element cos trong head;
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
//            khai bao 1 node temp de tro den haed;
            Node temp = head;
            while (temp.next != null) {
//                neu nhu ton tai 1 phan tu co data bang data truyen vao thi node do se bi remove;
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public LinkedList<E> clone() {
//        kiem tra linkedlist co phan tu hay khong;
        if (numNode == 0) {
            throw new NullPointerException("LinkedList nay la null");
        }
//        khai bap linked tra ve
        LinkedList<E> returnLinkedList = new LinkedList<E>();
//        khai bao bien temp de tro den heap;

        Node temp = head;
//        add temp vao danh sach tra ve danh sach moi
        returnLinkedList.addFist((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;

        }
        return returnLinkedList;
    }

    public boolean constrains(E element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.getData().equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public E getLast(){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        return (E) temp.data;
    }
    public E getFirst(){
        Node temp=head;
        return (E) temp.data;
    }
    public void clear(){
        Node temp=head;

        for (int i = 0; i <= numNode; i++) {
            temp.next=null;
            numNode--;
        }
        temp=null;
        numNode--;
        System.out.println(numNode);
    }
}
