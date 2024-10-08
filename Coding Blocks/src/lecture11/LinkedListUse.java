package lecture11;

import java.util.Scanner;
import lecture11.Node;
public class LinkedListUse {

	public static Node<Integer> takeLLInputBetter() {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		Node<Integer> tail = null;
		System.out.println("Enter first element");
		int nextElement = s.nextInt();
		while (nextElement != -1) {
			Node<Integer> nextNode = new Node<Integer>(nextElement);
			if (head == null) {
				head = nextNode;
				tail = nextNode;
			} else {
				tail.next = nextNode;
				tail = nextNode;
			}
			System.out.println("Enter next element");
			nextElement = s.nextInt();
		}
		return head;
	}
	
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
	
	public static<T> int lengthR(Node<T> head) {
		if (head == null) {
			return 0;
		}
		return 1 + lengthR(head.next);
	}
	
	public static<T> int length(Node<T> head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
	public static<T> Node<T> insert(Node<T> head, int position, T element) {
		if (position > length(head)) {
			return head;
		}
		
		Node<T> newNode = new Node<T>(element);
		
		if (position == 0) {
			newNode.next = head;
			return newNode;
		}
		
		Node<T> prevNode = head;
		int i = 1;
		while (i < position) {
			i++;
			prevNode = prevNode.next;
		}
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		return head;
	}
	
//	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
//		// oh, ot
//		while (head1 != null && head2 != null) {
//			
//		}
//		if (head1 != null) {
//			
//		}
//		
//		if (head2 != null) {
//			
//		}
//		//return oh;
//	}
	
	public static Node<Integer> findMidNode(Node<Integer> head) {
		if (head == null) {
			return null;
		}
		Node<Integer> fast = head.next;
		Node<Integer> slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public static int findElement(Node<Integer> head, int element) {
		if (head == null) {
			return -1;
		}
		
		if (head.getData() == element) {
			return 0;
		}
		
		int smallerOutput = findElement(head.next, element);
		if (smallerOutput == -1) {
			return -1;
		} else {
			return smallerOutput + 1;
		}
	}
	
	
	
	public static Node<	Integer> delLL(Node<Integer> head,int position) {
		if(position==0) {
			head=head.next;
			return head;
		}
		else {
    Node<Integer> currentNode=head;
    int count=0;
    while(count<position-1) {
    	
    	count++;
    	currentNode=currentNode.next;
    }
    currentNode.next=currentNode.next.next;
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeLLInput();
		printLL(head);
		head = insert(head, 1, 1);
		printLL(head);
		// printLL(head);
		 
		 head= delLL(head, 0);
		 printLL(head); 
		 
	}

}
