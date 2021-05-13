package bai_10_list.thuc_hanh.deploy_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger=new MyList<Integer>();
        listInteger.addElement(2);
        listInteger.addElement(6);
        listInteger.addElement(7);
        listInteger.addElement(19);


        System.out.println("element 3: "+listInteger.getIndex(2));
        System.out.println("element 4: "+listInteger.getIndex(3));
        System.out.println("element 2: "+listInteger.getIndex(1));
//        listInteger.getIndex(6);
//        System.out.println("element 6: "+listInteger.getIndex(6));
        listInteger.getIndex(-1);
        System.out.println("element -1: "+listInteger.getIndex(-1));

    }
}
