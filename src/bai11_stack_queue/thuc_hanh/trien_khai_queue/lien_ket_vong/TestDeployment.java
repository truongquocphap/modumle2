package bai11_stack_queue.thuc_hanh.trien_khai_queue.lien_ket_vong;

public class TestDeployment {
       public static void main(String[] args) {
           DeploymentQueue queue = new DeploymentQueue();
           queue.enqueue(10);
           queue.enqueue(20);
           queue.dequeue();


           queue.enqueue(30);
           queue.enqueue(40);
           queue.enqueue(50);
           queue.dequeue();
           System.out.println("Dequeued item is " + queue.dequeue().key);
       }
}


