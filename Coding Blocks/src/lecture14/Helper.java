package lecture14;



public class Helper {
	static int height(BinaryTreeNode<Integer> node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(height(node.left), height(node.right));
	}

	static int search(char arr[], int strt, int end, char value) {
		int i;
		for (i = strt; i <= end; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return i;
	}
}
