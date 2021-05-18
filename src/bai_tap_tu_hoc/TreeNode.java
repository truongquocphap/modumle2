package bai_tap_tu_hoc;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> right;
    protected TreeNode<E> left;

    public TreeNode(E e){
        element=e;

    }

    public TreeNode<Integer> search(E element){
        TreeNode<Integer> root=new TreeNode<>(60);
        root.left=new TreeNode<>(46);
        root.right=new TreeNode<>(100);
        TreeNode<E> current= (TreeNode<E>) root;
      return root;
    }
}

