package lecture14;

import java.util.Scanner;

import lecture13.QueueUsingArray;


public class TreeUse {

	public static TreeNode<Integer> takeTreeInputLevelWise() throws QueueEmptyException { 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		QueueUsing_Linked_List<TreeNode<Integer>> queue = new QueueUsing_Linked_List<>();
		queue.enqueue(root);
			
		while (!queue.IsEmpty()) {
			TreeNode<Integer> firstElement;
			try {
				firstElement = queue.dequeue();
			} catch (QueueEmptyException e) {
				// cant come here;
				return null;
			}
			System.out.println("Enter num children for " + firstElement.getData());
			int numChildren = s.nextInt();
			for (int i = 0; i < numChildren; i++) {
				System.out.println("Enter " + i + "th child of " + firstElement.getData());
				int nextChild = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(nextChild);
				queue.enqueue(child);
				firstElement.children.add(child);
			}
		}
		return root;
	}
	
	public static TreeNode<Integer> takeTreeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		
		System.out.println("Enter number of children for " + rootData);
		int numChildren = s.nextInt();
		
		for (int i = 0; i < numChildren; i++) {
			root.children.add(takeTreeInput());
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String toBePrinted = root.getData() + ":";
		for (int i = 0; i < root.children.size(); i++) {
			toBePrinted = toBePrinted + root.children.get(i).getData() + ",";
		}
		System.out.println(toBePrinted);
		
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}

	}
	
	
	public static int max(TreeNode<Integer> root) {
		int max = root.getData();
		for (int i = 0; i < root.children.size(); i++) {
			int childMax = max(root.children.get(i));
			if (max < childMax) {
				max = childMax;
			}
		}
		return max;
	}
	
	public static void postorder(TreeNode<Integer> root) {
		for (TreeNode<Integer> child: root.children) {
			postorder(child);
		}
		System.out.println(root.getData());	
	}
	
	public static void preorder(TreeNode<Integer> root) {
		System.out.println(root.getData());
		
		for (TreeNode<Integer> child: root.children) {
			preorder(child);
		}
	}
	
	
	
	public static int size(TreeNode<Integer> root) {
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count = count + size(root.children.get(i));
		}
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		TreeNode<Integer> root = takeTreeInputLevelWise();
		print(root);
	}

}
