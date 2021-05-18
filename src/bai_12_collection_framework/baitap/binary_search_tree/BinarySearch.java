package bai_12_collection_framework.baitap.binary_search_tree;

public class BinarySearch {
    Node root;

    public class Node {
        int data;
        Node parent;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
            this.parent = null;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearch() {
        this.root = null;
    }
     void insertNode(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            root=node;
        } else if (data < node.data && node.left == null) {
            node.left = new Node(data);
            node.left.parent = node;
        } else if (data >= node.data && node.right == null) {
            node.right = new Node(data);
            node.right.parent = node;
        } else {
            if (data < node.data) {
                insertNode(node.left, data);
            } else {
                insertNode(node.right, data);
            }
        }
    }

    public boolean search(Node node, int data) {
        if (node == null) {
            return false;
        } else if (node.data == data) {
            return true;
        } else {
            if (data < node.data) {
                return search(node.left, data);
            }
            return search(node.right, data);
        }
    }
    public void postOrder(Node node){
        if (node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data+ " - ");
        }
    }
    public void preOrder(Node node){
        if (node!=null){
            System.out.println(node.data+ " - ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public boolean isEmpty(){
        return root==null;
    }
    public boolean delete(int data) throws NoSuchFieldException {
        if (isEmpty())
            throw new NoSuchFieldException("tree is empty");
        Node current=root;
        Node parent=root;
        boolean isLeft=false;
        while (current.data!=data){
            parent=current;
            if (current.data>data){
                isLeft=true;
                current=current.left;
            }
            else if (current.data<data){
                isLeft=false;
                current=current.right;
            }
           else if (current==null){
               return false;
            }
        }



        if (current.left!=null && current.right==null){
            if (current==root)
                root=null;
            if (isLeft)
                parent.left=null;
            else
                parent.right=null;
        }
        else if (current.right != null && current.left !=null){
            if (current==root)
                root=current.right;
            else if (isLeft)
                root=current.right;
            else
                parent.right=current.right;
        }



        else if (current.left!=null && current.right!=null){
            Node successor=getRoot(current);
            if (current==root)
                root=successor;
            if (isLeft)
                parent.left=successor;
            else
                parent.right=successor;
            successor.left=current.left;
        }
        return true;
    }
    public Node getRoot(Node delete){
        Node successor = null;
        Node parentSuccessor=null;
        Node currentNode=delete.left;
        while (currentNode!=null){
            parentSuccessor = successor;
            successor= currentNode;
            currentNode=currentNode.left;
        }
        if (successor != delete.right){
            parentSuccessor.left=successor.left;
            currentNode.right=delete.right;
        }
        return successor;
    }
}
