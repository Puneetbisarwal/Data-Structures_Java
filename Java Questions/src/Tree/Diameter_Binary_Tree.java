package Tree;

import Tree.BinaryTreeNode;


public class Diameter_Binary_Tree {
    BinaryTreeNode<Integer> root;
    

    public int diameterOfBinaryTree(BinaryTreeNode<Integer> root)
    {
      int[] diameter = new int[1];
      height(root,diameter);

      return diameter[0];
    }

    private int height(BinaryTreeNode<Integer> root, int [] dia)
    {
        if (root == null)
            return 0;

        int lheight = height(root.left,dia);
        int rheight = height(root.right,dia);

        dia[0] = Math.max(dia[0], lheight + rheight);

        return 1 + Math.max(lheight, rheight);
    }

    public int isbalanced(BinaryTreeNode<Integer> root)
    {
        if (root == null)
            return 0;

        int lh = isbalanced(root.left);
        if (lh == -1)
            return -1;

        int rh = isbalanced(root.right);
        if (rh == -1)
            return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;
        else
            return Math.max(lh, rh) + 1;
    }


    public static void main(String[] args)
    {
        Diameter_Binary_Tree tree = new Diameter_Binary_Tree();
        tree.root = new BinaryTreeNode<Integer>(1);
        tree.root.left = new BinaryTreeNode<Integer>(2);
        tree.root.right = new BinaryTreeNode<Integer>(3);
        tree.root.right.left = new BinaryTreeNode<Integer>(4);
        tree.root.right.left.left = new BinaryTreeNode<Integer>(5);
        tree.root.right.left.left.left = new BinaryTreeNode<Integer>(9);
        tree.root.right.right = new BinaryTreeNode<Integer>(6);
        tree.root.right.right.right = new BinaryTreeNode<Integer>(7);
        tree.root.right.right.right.right = new BinaryTreeNode<Integer>(8);

        System.out.print("\nDiameter of Binary tree is = " + tree.diameterOfBinaryTree(tree.root));

        if (tree.isbalanced(tree.root) > 0)
            System.out.print("\nBalanced Binary Tree.");
        else
            System.out.print("\nNot Balanced Binary Tree.");
    }
}
