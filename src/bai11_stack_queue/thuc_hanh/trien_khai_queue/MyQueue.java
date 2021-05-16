package bai11_stack_queue.thuc_hanh.trien_khai_queue;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head;
    private int tail;
    private int currentSize;
    public MyQueue(int queueSize){
        this.capacity=queueSize;
        queueArr=new int[this.capacity];
    }
    public boolean isQueueEmpty(){
        boolean status=false;
        if (currentSize==0){
            return status=true;
        }
        return false;
    }
    public void enqueue(int item){
        if (isQueueEmpty()){
            System.out.println("overflow ! unable to add element: "+item);
        }else {
            tail++;
            if (tail==capacity-1){
                tail=0;
            }
            queueArr[tail]=item;
            currentSize++;
            System.out.println("element "+item+"is pushed to queue !");
        }
    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("underflow ! unable to remove element from Queue");
        }else {
            head++;
            if (head==capacity-1) {
                System.out.println("pop operation done ! removed: "+queueArr[head-1]);
            }else {
                System.out.println("pop operation done ! removed: "+queueArr[head-1]);
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {
        MyQueue queue=new MyQueue(5);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.dequeue();
    }


}
