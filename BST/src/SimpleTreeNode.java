public class SimpleTreeNode<E extends Comparable<E>> implements TreeNode<E> {

    private E data;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public SimpleTreeNode(E data){

        this.data = data;
        this.left = null;
        this.right = null;

    }

    @Override
    public E getData() {

        return this.data;

    }

    @Override
    public void setData(E data) {

        this.data = data;

    }

    @Override
    public void setLeft(TreeNode<E> left) {

        this.left = left;

    }

    @Override
    public TreeNode<E> getLeft() {

        return this.left;

    }

    @Override
    public void setRight(TreeNode<E> right) {

        this.right = right;

    }

    @Override
    public TreeNode<E> getRight() {

        return this.right;

    }

}
