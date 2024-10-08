package Tree;

class Node2 {
    int data;
    Node2 left;
    Node2 right;

    public Node2 (int item)
    // public Node1 (int data)
    {
        data = item;
        //this.data = data;
        left = right = null;
    }
}
public class BFS_Binary_Tree {

    Node2 root;
    // Level Order Traversal (Breadth First Search or BFS)

    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    int height(Node2 root)
    {
        if (root == null)
            return 0;


             // Compute  height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // use the larger one
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);

    }

    void printCurrentLevel(Node2 root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    public static void main(String args[])
    {
        BFS_Binary_Tree tree = new BFS_Binary_Tree();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);

        System.out.print("\nLevel order traversal of binary tree is = ");
        tree.printLevelOrder();
    }
}
