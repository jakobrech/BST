public interface TreeNode <E>{

    E getData();
    void setData(E data);

    void setLeft(TreeNode<E> left);
    TreeNode<E> getLeft();

    void setRight(TreeNode<E> right);
    TreeNode<E> getRight();

}
