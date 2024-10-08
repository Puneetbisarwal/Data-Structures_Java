package lecture11;

import java.util.Scanner;

public class BubbleSort_Linked_List {
	
	
	public static Node<Integer> takeLLInput() {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		System.out.print("Enter First Element = ");
		int nextElement = s.nextInt();
		while (nextElement != -1) {
			Node<Integer> nextNode = new Node<Integer>(nextElement);
			if (head == null) {
				head = nextNode;
			} else {
				Node<Integer> tail = head;
				while (tail.next != null) {
					tail = tail.next;
				}
				tail.next = nextNode;
			}
			System.out.print("Enter Next Element = ");
			nextElement = s.nextInt();
		}
		return head;
	}
	

	   public static Node<Integer> bubbleSort(Node<Integer> head) {
		int n = Length(head);
		
		for(int i=0;i<n-1;i++) {
		Node<Integer> prev =null;
		Node<Integer> curr =head;
			
		for(int j=0 ;j<n-i-1;j++) {
	//	while(curr!=null && curr.next !=null) {	
		if(curr.getData()<=curr.next.getData()) {
				prev=curr;
				curr=curr.next;
			} 
			 else {
				if(prev==null) {
					Node<Integer> fwd = curr.next;
					head=head.next;
					curr.next=fwd.next;
					fwd.next=curr;
					prev=fwd;
					
				} else {
					Node<Integer> fwd = curr.next;
					prev.next=fwd;
					curr.next=fwd.next;
					fwd.next=curr;
					prev=fwd;
				}
			}
			}
		}
              return head;
	}
	   
	   
	   public static void printLL(Node<Integer> head) {
			while (head != null) {
				System.out.print(head.getData() + "-->");
				head = head.next;
			}
			System.out.println();
		}
		

	private static int Length(Node<Integer> head) {
		int count=0;
		while(null!=head) {
			head=head.next;
			count++;
					
		}
		return count;
	}
	   
	public static void main(String[] args) {
		Node<Integer> head = takeLLInput();
		printLL(head);
		head=bubbleSort(head);
		printLL(head);
		
	}

}
