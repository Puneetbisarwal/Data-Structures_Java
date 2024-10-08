
package Trees;

import java.util.Scanner;

import lecture12.QueueEmptyException;
import lecture13.QueueUsingArray;
import lecture12.QueueUsing_Linked_List;
import java.util.Scanner;
import java.util.ArrayList;

public class TreeUse {
	public static TreeNode<Integer> TakeInput() throws Exception{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Root Data =");
		int x=s.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(x);
		QueueUsing_Linked_List<TreeNode<Integer>> q=new  QueueUsing_Linked_List<>();
		q.enqueue(root);
		while(!q.IsEmpty()){
			TreeNode<Integer> firstElement;
			try{
				firstElement=q.dequeue();
			}catch(QueueEmptyException e){
				return null;
			}
			int numChildren=s.nextInt();
			firstElement.setsize(numChildren);
			for(int i=0;i<numChildren;i++){
				int nextChild=s.nextInt();
				TreeNode<Integer> child=new TreeNode<Integer>(nextChild);
				q.enqueue(child);
				firstElement.arraylist.add(child);
			}
		}
		return root;
	}



	public static void printtree(TreeNode<Integer> root){
		if(root==null)
			return;
		QueueUsing_Linked_List<TreeNode<Integer>> q=new  QueueUsing_Linked_List<>();
		q.enqueue(root);
		while(!q.IsEmpty()){
			TreeNode<Integer> firstElement;
			try{
				firstElement=q.dequeue();
			}catch(QueueEmptyException e){
				return ;
			}
			System.out.print(firstElement.getData()+":");
			for(int i=0;i<firstElement.getsize();i++){
				q.enqueue(firstElement.arraylist.get(i));
				System.out.print(firstElement.arraylist.get(i).getData()+" ");
			}
			System.out.println();
		}
	}


	public static int max(int a,int b){
		if(a>b)
			return a;
		else
			return b;

	}


	public static int height(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		else if(root.arraylist.size()==0)
			return 1;
		int ans=0;
		for(int i=0;i<root.getsize();i++) {
			ans=max(ans,height(root.arraylist.get(i)));
			//ans=Math.max(arg0, arg1)
		}
		return ans+1;

	}

	
	
//public void  sum(TreeNode<Integer> root) {
//	if(root==null)
//		return 0;
//	else {
//		for(int i=0;i<root.getData();i++ )
//	}
//	
//}
	
	
	
	public static int solve(TreeNode<Integer> root,int x){
		if(root==null)
			return 0;
		else{
			int y=0,count=0;
			if(root.getData()>x){
				y=1;
				System.out.println("The Greater node is = "+root.getData());
			}
			y=root.getData();
			for(int i=0;i<root.getsize();i++){
				//count=count+solve(root.arraylist.get(i),x);
				y=max(y,solve(root.arraylist.get(i),x));
			}
			//return count+y;
			return y;
		}
	}


	


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=TakeInput();
		//printtree(root);
		int y=1;
		//System.out.print("The Printed Node is = ");
		//System.out.print(max(1,2));
		System.out.println();
		System.out.println("\nTotal Number of Greater Node is ="+solve(root,y));
		//System.out.println("The Height of the Tree is = "+height(root));
	}

}








