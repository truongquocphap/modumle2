package bai11_stack_queue.thuc_hanh.trien_khai_stack;

public class OptionalStack {
    private int arr[];
    private int size;
    private int index=0;

    public OptionalStack(int size) {
        this.size=size;
        arr=new int[this.size];
    }
    public boolean isEmpty(){
        if (size==0){
           return true;
        }
        return false;
    }
    public boolean isFull(){
        if (index==size){
            return true;
        }
        return false;
    }
    public void push(int elements){
        if (isFull()){
            System.out.println("full roi maf push cai gi!!!!");
        }else {
           arr[index]=elements;
           index++;
        }
    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("co cai gi da ma xoa");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }

}
