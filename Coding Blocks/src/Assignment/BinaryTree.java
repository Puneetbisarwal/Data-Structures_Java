package Assignment;

import lecture14.BinaryTreeNode;

public class BinaryTree {

	//Q-2
	public  static boolean isIdentical(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2) {
		if(root1 ==null && root2==null) {
			return true;
		} 
		if(root1 ==null || root2==null) {
			return false;
			
		}
	 return	isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	}
	
	
//	//Q-3
//		public  static boolean isBalanced(BinaryTreeNode<Integer> root) {
//			if(root==null) {
//				return true;
//			}
//			int leftHt=Helper.height(root.left);
//			int rightHt=Helper.height(root.right);
//			int diff=Math.abs(leftHt-rightHt);
//			
//			 return (diff>=1) && isBalanced(root.left) && isBalanced(root.right);
//			
//			
//		}
		
	
	
	
//	public static void printR(TreeNode<Integer> root,int level,boolean flag) {
//	if(root==null) {
//		return;
//	}
//	if(level==0) {
//		System.out.print(root.data);
//	}
//		if(flag) {
//			printR(root.left, level-1, flag);
//			printR(root.right, level-1, flag);	
//		} else {
//			printR(root.right, level-1, flag);
//			printR(root.left, level-1, flag);
//			
//		}
//}
//
//public static void printZigZag(BinaryTreeNode<Integer> root) {
//	
//	int ht = Helper.height(root);
//	boolean flag=false;
//	for(int i=0;i<ht;i++) {
//		printR(root,i,flag);
//		flag=!flag;
//	}
//}



//
//public static BinaryTreeNode<Integer> fun (BinaryTreeNode<Integer> root) {
//	if(root.left ==null &&root.right) {
//		return null; 
//	}
//}
//


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
