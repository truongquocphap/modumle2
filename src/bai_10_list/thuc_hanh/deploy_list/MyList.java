package bai_10_list.thuc_hanh.deploy_list;

import java.util.Arrays;

public class MyList<ElementList> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object element[];

    public MyList() {
        element=new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element,newSize);
    }
    public void addElement(ElementList newElement){
        if (size==element.length){
            ensureCapa();
        }
        element[size++]=newElement;
    }
    public ElementList getIndex(int index){
        if (index>=size || index<0){
            throw new IndexOutOfBoundsException("Index: "+index +
                    " Size: "+ index);
        }
        return (ElementList) element[index];
    }
}
