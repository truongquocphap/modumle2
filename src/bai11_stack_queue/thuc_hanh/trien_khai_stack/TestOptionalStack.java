package bai11_stack_queue.thuc_hanh.trien_khai_stack;

public class TestOptionalStack {
    public static void main(String[] args) throws Exception {
        OptionalStack stack=new OptionalStack(5);
        stack.push(3);

        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("1: size of stack :"+stack.size());
        System.out.println("2. pop element from stack : ");
        while (!stack.isEmpty()){
            System.out.println("pop element  "+stack.pop());
        }
        System.out.println("size of stack after pop operation "+stack.size());
    }
}
