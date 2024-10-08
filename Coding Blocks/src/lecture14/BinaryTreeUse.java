package lecture14;

import java.util.Scanner;
import java.util.Stack;

import Trees.TreeNode;

public class BinaryTreeUse {

	private static Scanner s = new Scanner(System.in);

	public static int countNumNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int count = 1;
		count = count + countNumNodes(root.left) + countNumNodes(root.right);
		return count;
	}

	public static void postorder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}

	public static void preorder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);

	}

	public static BinaryTreeNode<Integer> findNode(
			BinaryTreeNode<Integer> root, int element) {
		if (root == null)
			return null;

		if (root.data == element)
			return root;

		BinaryTreeNode<Integer> left = findNode(root.left, element);
		BinaryTreeNode<Integer> right = findNode(root.right, element);

		if (left != null)
			return left;
		else if (right != null)
			return right;

		return null;
	}
	
	
	
	
	static int preOrderIndex=0;
	
	public static BinaryTreeNode<Character> constructTree(char[] inOrder,char[] preOrder,int start,int end) {
		
	if(start>end) {
		return null;
	}
		BinaryTreeNode<Character> node=new BinaryTreeNode<>(preOrder[preOrderIndex++]);
	    int index=Helper.search(inOrder,start,end,node.data);
	
	
	if(start==end) {
		return node;
	}
		node.left=constructTree(inOrder, preOrder, start,index-1);
		node.right=constructTree(inOrder, preOrder,index+1, end);
	    return node;
	}
	
	

	
	
	
	
	public static void printBT(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		String toBePrinted = root.data + ":";
		if (root.left != null) {
			toBePrinted = toBePrinted + root.left.data;
		}

		if (root.right != null) {
			toBePrinted = toBePrinted + "," + root.right.data;
		}
		System.out.println(toBePrinted);
		printBT(root.left);
		printBT(root.right);
	}

	public static BinaryTreeNode<Integer> takeBTInput() {
		System.out.println("Enter root data");
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = takeBTInput();
		root.right = takeBTInput();
		return root;
	}

	
	public static int max(BinaryTreeNode<Integer> root) {
		if (root == null)
			return -1;

		if (root.left == null && root.right == null)
			return root.data;

		int leftMax = max(root.left);
		int rightMax = max(root.right);
		int max;
		max = leftMax > rightMax ? leftMax : rightMax;
		max = max > root.data ? max : root.data;
		return max;

	}

	
	 public static int height(BinaryTreeNode<Integer> root) {
	 if(root==null)
	 return 0;
	 int height1=0;
	 int height2=0;
	 height1=height(root.left);
	 height2=height(root.right);
	 if(height1>height2)
	 return height1+1;
	 else {
		 return height2+1;
	 }
	
	 }
	
	 
	
	 
	 
	 

	 
	
	 public static BinaryTreeNode<Integer>  mirror(BinaryTreeNode<Integer> root) {
		 if(root==null) {
			 return null ;
		 }
		
		 BinaryTreeNode<Integer> root1= mirror(root.left);
		 BinaryTreeNode<Integer> root2= mirror(root.right);
		 
		 //BinaryTreeNode<Integer> temp=root1;
		 root.left=root2;
		 root.right=root1;
		 
		 return root;
		 
	 }

	public static void main(String[] args) {
		// 1 2 4 -1 -1 -1 3 -1 5 -1 -1

		// Scanner s = new Scanner(System.in);
		// int a = s.nextInt();
		// Scanner s1 = new Scanner(System.in);
		// int b = s1.nextInt();
		// System.out.println(a + b);

		BinaryTreeNode<Integer> root = takeBTInput();
		 printBT(root);
		// System.out.print("The Post Order of Tree = ");
		// postorder(root);
		// System.out.println();
		// System.out.print("The Pre Order of Tree = ");
		// preorder(root);
		// System.out.print("The Maximum Data is = "+max(root));
		//System.out.println("The Node to be Find is  = "+ findNode(root, 5).data);
		// System.out.println(countNumNodes(root));
		//System.out.println("The Height  of the Node  is  = "+ height(root));
		 root =  mirror(root);
		 System.out.println("The Mirror of Node is = ");
		 printBT(root);
	}
}
