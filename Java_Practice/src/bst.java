class Node{
	int data;
	Node left;
	Node right;
}
public class bst {
static boolean isBST(Node root,int midRange,int maxRange){
	if(root==null){
		return true;
	}
	if(root.data>minRange && root.data<maxRange){
		if(isBST(root.left,minRange,root.data) &&isBST(root.right,root.data,maxRange) );
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
