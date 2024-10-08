package Tree;

public class LCA_Binary_Search_Tree {

    //Lowest Common Ancestor in a Binary Search Tree

    BinaryTreeNode<Integer> root;

    public BinaryTreeNode<Integer> LowestCommonAncestor(BinaryTreeNode<Integer> root, int n1, int n2)
    {
        if (root == null )
            return root;


        // If both n1 and n2 are smaller than root, then LCA
        // lies in left
        if (root.data > n1 && root.data > n2)
            return LowestCommonAncestor(root.left, n1, n2);

        // If both n1 and n2 are greater than root, then LCA
        // lies in right
        if (root.data < n1 && root.data < n2)
            return LowestCommonAncestor(root.right, n1, n2);

        return root;

    }

    public static void main(String[] args)
    {
        LCA_Binary_Search_Tree tree = new LCA_Binary_Search_Tree();
        tree.root = new BinaryTreeNode<Integer>(20);
        tree.root.left = new BinaryTreeNode<Integer>(8);
        tree.root.right = new BinaryTreeNode<Integer>(22);
        tree.root.left.left = new BinaryTreeNode<Integer>(4);
        tree.root.left.right = new BinaryTreeNode<Integer>(12);
        tree.root.left.right.left = new BinaryTreeNode<Integer>(10);
        tree.root.left.right.right = new BinaryTreeNode<Integer>(14);


        int n1 = 4, n2 = 22;
        BinaryTreeNode<Integer> t = tree.LowestCommonAncestor(tree.root,n1,n2);
        System.out.print("\nLowest Common Ancestor of " + n1 + " and " + n2 + " is = " + t.data);
    }
}
