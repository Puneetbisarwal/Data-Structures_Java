package Tree;

public class Binary_Tree_Use {

    BinaryTreeNode<Integer> root;

    BinaryTreeNode<Integer> root1;

    //Height of Binary Tree
    public int maxDepth(BinaryTreeNode<Integer> root)
    {
        if (root == null)
            return 0;

        int lheight = maxDepth(root.left);
        int rheight = maxDepth(root.right);

        return 1 + Math.max(lheight, rheight);
    }

    public static int maxPathSum(BinaryTreeNode<Integer> root)
    {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    public static int maxPathDown(BinaryTreeNode<Integer> root, int maxValue[]) {
        if (root == null)
            return 0;
        int left = Math.max(0, maxPathDown(root.left, maxValue));
        int right = Math.max(0, maxPathDown(root.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + root.data);
        return Math.max(left, right) + root.data;
    }



    public static void main(String[] args)
    {
        Binary_Tree_Use tree = new Binary_Tree_Use();
        tree.root = new BinaryTreeNode<Integer>(1);
        tree.root.left = new BinaryTreeNode<Integer>(2);
        tree.root.right = new BinaryTreeNode<Integer>(3);
        tree.root.right.left = new BinaryTreeNode<Integer>(4);
        tree.root.right.left.left = new BinaryTreeNode<Integer>(5);
        tree.root.right.right = new BinaryTreeNode<Integer>(6);

        System.out.println("\nMaximum Depth in Binary tree is = " + tree.maxDepth(tree.root));


        Binary_Tree_Use tree1 = new Binary_Tree_Use();
        tree1.root1 = new BinaryTreeNode<Integer>(-10);
        tree1.root1.left = new BinaryTreeNode<Integer>(9);
        tree1.root1.right = new BinaryTreeNode<Integer>(20);
        tree1.root1.right.left = new BinaryTreeNode<Integer>(15);
        tree1.root1.right.right = new BinaryTreeNode<Integer>(7);

        int answer = maxPathSum(tree1.root1);
        System.out.println("\nThe Max Path Sum for this tree is " + answer);

    }
}
