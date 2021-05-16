package bai11_stack_queue.thuc_hanh.trien_khai_stack;

public class TestMygenericStack {
    public static void main(String[] args) {
        MyGenericStack string=new MyGenericStack();
        System.out.println("1. Stack of in String");
        string.stackOfStrings();

        System.out.println("2. stack of in integers ");
        MyGenericStack integers=new MyGenericStack();
        integers.stackOfIntegers();


    }
}
