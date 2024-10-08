package lecture14;

import java.util.ArrayList;

public class TreeNode<T> {
	private T data;
	public ArrayList<TreeNode<T>> children;

	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

//	public TreeNode<T> getChild(int i) {
//		return children.get(i);
//	}
//
//	public void setChild(int i, TreeNode<T> children) {
//		this.children.set(i, children);
//	}
	
	
	
}

