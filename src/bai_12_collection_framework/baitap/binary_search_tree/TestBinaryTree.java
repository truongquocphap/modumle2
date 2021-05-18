package bai_12_collection_framework.baitap.binary_search_tree;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        System.out.println("--------insert-----------");
            binarySearch.insertNode(binarySearch.root,20);
            binarySearch.insertNode(binarySearch.root,3);
            binarySearch.insertNode(binarySearch.root,5);
            binarySearch.insertNode(binarySearch.root,56);
            binarySearch.insertNode(binarySearch.root,210);
            binarySearch.insertNode(binarySearch.root,34);
            binarySearch.insertNode(binarySearch.root,65);

        System.out.println("-------postOrder------");
        binarySearch.postOrder(binarySearch.root);
        System.out.println("-------preOrder-------");
        binarySearch.preOrder(binarySearch.root);
        System.out.println("---------search--------");
        System.out.println(binarySearch.search(binarySearch.root,5)? " found" : "Not found");
        System.out.println(binarySearch.search(binarySearch.root,10)? " found" : "Not found");

    }
}
