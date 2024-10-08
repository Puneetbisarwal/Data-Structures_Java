package Tree;



class Node1
{
    int data;
    Node1 left;
    Node1 right;

    public Node1(int item)
    //public Node(int data)
    {
        data = item;
        //this.data = data;
        left = right = null;
    }
}


public class Binary_Tree {

    Node1 root;
    Node1 root1, root2;

    // Depth First Search (DFS)
    public void InorderTree(Node1 node) {
        if (node == null)
            return ;

            InorderTree(node.left);
            System.out.print(" " + node.data);
            InorderTree(node.right);
    }

    public void PreorderTree(Node1 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            PreorderTree(node.left);
            PreorderTree(node.right);
        }
    }

    public void PostorderTree(Node1 node) {
        if (node != null) {
            PostorderTree(node.left);
            PostorderTree(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Compute  height of each subtree
    int height(Node1 node)
    {
        // code here
        if(node == null)
        {
            return 0;
        }

        int Hleft = 1 + height(node.left);
        int Hright = 1 + height(node.right);

        if(Hleft>Hright)
            return Hleft;
        else
            return Hright;

    }

    boolean identicalTrees(Node1 a, Node1 b)
    {
        /*1. both empty */
        if (a == null && b == null)
            return true;

        /* 2. both non-empty -> compare them */
        if (a != null && b != null)
            return (a.data == b.data && identicalTrees(a.left, b.left)  && identicalTrees(a.right, b.right));

        /* 3. one empty, one not -> false */
        return false;
    }

    public static void main(String [] args) {

        Binary_Tree tree = new Binary_Tree();
        tree.root = new Node1(4);
        tree.root.left = new Node1(5);
        tree.root.right = new Node1(10);
        tree.root.left.left = new Node1(7);
        tree.root.left.right = new Node1(8);
        tree.root.right.right = new Node1(1);

        System.out.print("\nBinary Tree: \n");
        System.out.print("\nPreorder Tree: ");
        tree.PreorderTree(tree.root);

        System.out.print("\nInorder Tree: ");
        tree.InorderTree(tree.root);

        System.out.print("\nPostorder Tree: ");
        tree.PostorderTree(tree.root);

        System.out.print("\nHeight of Binary Tree: " + tree.height(tree.root));

        Binary_Tree tree1 = new Binary_Tree();
        tree1.root1 = new Node1(1);
        tree1.root1.left = new Node1(2);
        tree1.root1.right = new Node1(3);
        tree1.root1.right.left = new Node1(4);
        tree1.root1.right.right = new Node1(5);



        tree1.root2 = new Node1(1);
        tree1.root2.left = new Node1(2);
        tree1.root2.right = new Node1(3);
        tree1.root2.right.left = new Node1(4);
        tree1.root2.right.right = new Node1(5);

        if (tree.identicalTrees(tree1.root1, tree1.root2))
            System.out.println("\nBoth trees are identical");
        else
            System.out.println("\nTrees are not identical");



    }
}


