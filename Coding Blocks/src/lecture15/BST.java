package lecture15;

import java.util.Scanner;

import lecture11.Node;
import lecture14.DoubleInt;

public class BST {
	
	private static Scanner s = new Scanner(System.in);
	
	public static  doubleInt isBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
			doubleInt output=new doubleInt(true,Integer.MIN_VALUE,Integer.MAX_VALUE);
			return output;
		}
		doubleInt leftOutput= isBST(root.left);
		doubleInt rightOutput= isBST(root.right);			
		 int max =Math.max(Math.max(leftOutput.max , rightOutput.max),root.data) ;
		 int min =Math.min(Math.min(leftOutput.min , rightOutput.min),root.data);
		 doubleInt output;
		 if(leftOutput.max<root.data && rightOutput.min>root.data && leftOutput.answer && rightOutput.answer) {
		     output=new doubleInt(true,max,min);
		  }	
		 else
		output=new doubleInt(false,max,min); 
		return output;
		 
	
		}
	

	
	public static int maxRight(BinaryTreeNode<Integer> root) {
		if (root == null)
			return -1;

		if (root.left == null && root.right == null)
			return root.data;

		int leftMax = maxRight(root.left);
		int rightMax = maxRight(root.right);
		int max;
		max = leftMax > rightMax ? leftMax : rightMax;
		max = max > root.data ? max : root.data;
		return max;

	}

	

	public static int minLeft(BinaryTreeNode<Integer> root) {
		
//		if (root == null)
//			return -1;
//
//		if (root.left == null && root.right == null)
//			return root.data;
//
//		int leftMax = minLeft(root.left);
//		int rightMax = minLeft(root.right);
//		int min;
//		min = leftMax > rightMax ? rightMax : leftMax;
//		min = min > root.data ? root.data : min;
//		return min;
//		
		

		
		
		
		int min=root.data;
		if(root.left!=null) {
			if(minLeft(root.left)<min)
				min=minLeft(root.left);
		}
		if(root.right!=null) {
			if(minLeft(root.right)<min)
				min=minLeft(root.right);
		}
		return min;
		}

//	public static Node<Integer> bstToLL(BinaryTreeNode<Integer> root) {
//		if(root==null) {
//			return null;
//		}
//		
//		Node<Integer> lhead = bstToLL(root.left);
//		Node<Integer> rhead = bstToLL(root.right);
//		Node<Integer> rootNode = new Node<Intege=>(root.data);
//	}
//	
	
	
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

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4 6 1 -1 -1 7 -1 -1 8 -1 10 -1 -1                [NOT BST]
		// 6 4 2 -1 -1 5 -1 -1 8 7 -1 -1 10 -1 -1           [BST]
		BinaryTreeNode<Integer> root1 = takeBTInput();
		 printBT(root1);
		 
		 //System.out.println("The Minimum Data is = "+minLeft(root1));
		 System.out.print("To Check it is BST or Not = "+isBST(root1).answer);
		 
		
	}
	

}
