package bai_12_collection_framework.thuchanh.nhi_phan;

public class Test {
    public static void main(String[] args) {
        TrienKhaiNhiPhan<String> tree=new TrienKhaiNhiPhan<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        System.out.println("Inorder (sorted) : ");
        tree.inorder();
        System.out.println("the number of nodes is: "+ tree.getSize());
    }
}
