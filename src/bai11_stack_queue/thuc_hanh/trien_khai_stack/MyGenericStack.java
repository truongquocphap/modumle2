package bai11_stack_queue.thuc_hanh.trien_khai_stack;

import bai_10_baitap.mylist.MyArrayList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack=new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }
    public static void stackOfStrings(){
        MyGenericStack<String> genericStack=new MyGenericStack<>();
        genericStack.push("Five");
        genericStack.push("Four");
        genericStack.push("Three");
        genericStack.push("Two");
        genericStack.push("One");
        System.out.println(" 1.1 Size of stack after push operation : "+genericStack.size());
        System.out.println("1.2 Pop elements from stack : ");
        while (!genericStack.isEmpty()){
            System.out.println(" %s "+genericStack.pop());
        }
        System.out.println(" \n 1.3 Size of stack after pop operations : "+genericStack.size());
    }
    public static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(" 2.1 Size of stack after push operations : "+stack.size());
        System.out.println("2.2 pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.println("%d "+ stack.pop());
        }
        System.out.println("\n 3.3 size of stack after pop operations : "+ stack.size());
    }
}
