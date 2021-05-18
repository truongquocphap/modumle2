package bai_12_collection_framework.thuchanh.nhi_phan;

public interface Tree<E> {
    public boolean insert(E e);
    public void inorder();
    public int getSize();
}
