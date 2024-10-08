package Trees;

import java.util.ArrayList;



public class TreeNode<T> {
private T data;
public ArrayList<TreeNode<T>> arraylist;
int size;
public TreeNode (T x){
	data=x;
	arraylist=new ArrayList<>();
}
public T getData() {
	return data;
}
public TreeNode<T> getChild(int i){
	return arraylist.get(i);
}
public void setchild(int i,TreeNode<T> child){
	arraylist.set(i, child);
}
public void setsize(int x){
	size=x;
}
public int getsize(){
	return size;
}
}
