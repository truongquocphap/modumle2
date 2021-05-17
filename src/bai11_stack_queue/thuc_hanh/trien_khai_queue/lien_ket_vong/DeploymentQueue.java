package bai11_stack_queue.thuc_hanh.trien_khai_queue.lien_ket_vong;

public class DeploymentQueue {
    class Node{
        public int key;
        public Node next;
        public Node (int key){
            this.key=key;
            this.next=null;
        }
    }
    private Node front;
    private Node rear;
    public DeploymentQueue(){
        this.front =null;
        this.rear =null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.rear ==null){
            this.front =this.rear =temp;
            return;
        }
        this.rear.next=temp;
        this.rear =temp;
    }
    public Node dequeue(){
        if (this.front ==null){
            return null;
        }
        Node temp=this.front;
        this.front =this.front.next;
        if (this.front ==null){
            this.rear =null;
        }
        return temp;
    }
}
