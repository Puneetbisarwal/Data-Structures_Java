package Tree;

public class LCA_Binary_Tree {

    BinaryTreeNode<Integer> root;
    public BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer> root, int n1, int n2)
    {

        if (root == null || root.data == n1 || root.data == n2)
            return root;

        BinaryTreeNode<Integer> left = lca(root.left,n1,n2);
        BinaryTreeNode<Integer> right = lca(root.right,n1,n2);

        if(left == null)
        {
            return right;
        }
        if(right == null)
        {
            return left;
        }

        return root;
    }

    public static void main(String[] args)
    {
        LCA_Binary_Tree tree = new LCA_Binary_Tree();
        tree.root = new BinaryTreeNode<Integer>(1);
        tree.root.left = new BinaryTreeNode<Integer>(2);
        tree.root.right = new BinaryTreeNode<Integer>(3);
        tree.root.right.left = new BinaryTreeNode<Integer>(4);
        tree.root.right.right = new BinaryTreeNode<Integer>(5);
        tree.root.right.left.left = new BinaryTreeNode<Integer>(8);
        tree.root.right.right.left = new BinaryTreeNode<Integer>(6);
        tree.root.right.right.right = new BinaryTreeNode<Integer>(7);


        int n1 = 8, n2 = 7;
        BinaryTreeNode<Integer> t = tree.lca(tree.root,n1,n2);
        System.out.print("\nLowest Common Ancestor Binary Tree of " + n1 + " and " + n2 + " is = " + t.data);
    }
}

