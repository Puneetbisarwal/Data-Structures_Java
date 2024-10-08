package Tree;

public class BinaryTreeNode<T> {

    public T data;

    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode () {}
    public BinaryTreeNode (T data)
    {
        this.data = data;
        left = right = null;
    }

    public BinaryTreeNode (T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
