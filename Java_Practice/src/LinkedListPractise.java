import java.util.Scanner;
class Node{
	int data;
	Node next;
	public Node(int d){
		data=d;
	}
}
public class LinkedListPractise{
     static Node prepareLinkedList(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node head=null;
		Node tail=null;
		while(data!=-1){
			Node node=new Node(data);
			if(head==null){
				head=node;
				tail=node;
			}
			else{
				tail.next=node;
				tail=tail.next;
			}
			data=s.nextInt();
		}
		return head;
		
	}
      
      static void reci(Node n){
    	  if(n==null){ 
    		 return; 
    	  }
    	  reci(n.next);
    	  System.out.println(n.data);
      }
      static void print(Node n){
    	  if(n==null){ 
    		 return; 
    	  }
    	  
    	  System.out.println(n.data);
    	  print(n.next);
      }
      static void size(Node n){
    	  int size1=1;
    	  while(n.next!=null){
    	  	  n=n.next;
    	  size1++;
      }
    	  System.out.print(size1); 
      }
     
      
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n=prepareLinkedList();
		size(n);
	}

}
