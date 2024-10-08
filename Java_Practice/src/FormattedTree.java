
 class BinaryTreeNode<T> {
	 T data;
	 T  left;
	 T right;
	 BinaryTreeNode(T data){
		 this.data=data;
	 }
}
public class FormattedTree {
	void formattedTree(BinaryTreeNode<Integer> root){
		if(root==null){
			return;
		}
		String tobePrinted=root.data + "; ";
		if(root.left!=null){
			tobePrinted=tobePrinted+root.left.data+" , ";
		}
		if(root.left!=null){
			tobePrinted=tobePrinted+root.right.data+" , ";
		}
		System.out.println(tobePrinted);
		formattedTree(root.left);
		formattedTree(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
