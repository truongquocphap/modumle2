package bai11_stack_queue.thuc_hanh.trien_khai_queue;

public class TestLinkedListQueue {
    public static void main(String[] args) {
        MyLinkedListQueue queue=new MyLinkedListQueue();
        queue.enqueue(12);
        queue.enqueue(11);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(45);
        queue.enqueue(60);
        queue.enqueue(70);
        System.out.println("dequeue item is "+queue.dequeue().key);
    }

}
