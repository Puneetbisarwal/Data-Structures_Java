package Tree;

import java.util.*;

class Node
{
    int data;
    Node left, right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
};


public class Path_Binary_Tree {

    static boolean getPath(Node root, ArrayList < Integer > arr, int x)
    {
        if (root == null)
            return false;

        arr.add(root.data);

        if (root.data == x)
            return true;

        if (getPath(root.left, arr, x) || getPath(root.right, arr, x))
            return true;

        arr.remove(arr.size() - 1);
        return false;

    }

    public static void printPath(Node root, int x)
    {
        // ArrayList to store the path
        ArrayList<Integer> arr=new ArrayList<>();

        // if required node 'x' is present
        // then print the path
        if (getPath(root, arr, x))
        {
            System.out.print("\nThe path is = ");
            for (int i=0; i<arr.size()-1; i++)
                System.out.print(arr.get(i)+"->");
            System.out.print(arr.get(arr.size() - 1));
        }

        // 'x' is not present in the binary tree
        else
            System.out.print("No Path");
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);

        int x = 7;
        printPath(root, x);
    }
}







