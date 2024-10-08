package Assignment;

import java.util.Scanner;
import lecture11.Node;
import lecture11.LinkedListUse;;
public class Practice_Questions {

	
	public static void possibleStrings(String input,int k,String output)  {
		if(input.length()==0) {
			return ;
		}
		if(k==0) {
			System.out.println(output);
			return ;
		}
		else {
			int i=0;
			for(i=0;i<input.length();i++) {
				possibleStrings(input,k-1,output+input.charAt(i));
			}
		}		
	}
	
	
	public static void reArrange(int []input) {
		int i=0;
		int	nextZero=0;
		int nextOne=input.length-1;
		while(i<=nextOne) {
			if(input[i]==0) {
				int temp=input[i];
				input[i]=input[nextZero];
				input[nextZero]=temp;
				nextZero++;
				i++;
			}
			else if(input[i]==1) {
				int temp=input[i];
				input[i]=input[nextOne];
				input[nextOne]=temp;
				nextOne--;
			}
			else {
				i++;
			}
		
			}
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
	
	
	
	public static void printLL(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + "-->");
			head = head.next;
		}
		System.out.println();
	}
	
	
	
	public static Node<Integer> linkedlist (Node<Integer> head) {
		Node<Integer> head1 = null;
		Node<Integer> tail1 = null;
		Node<Integer> head2 = null;
		Node<Integer> tail2 = null;
		Node<Integer> head3 = null;
		Node<Integer> tail3 = null;
		
		while(head!=null) {
		if(head.getData() %3==0) {
		head1=head;
		tail1=tail1.next;
	}
	}
			
		return head1;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	System.out.print("Enter the String = ");	
//    Scanner sc=new Scanner(System.in);
//    String  n=sc.nextLine();
//    int k=sc.nextInt();
//    String output="";
//    System.out.println("Possible Strings = ");
//    possibleStrings(n, k,output);
   // Node<Integer> head = takeLLInput();
	//printLL(head);
	
    int[] input ={ 1,2,0,0,0,1,1,4,5,6};
        reArrange(input);
	
        for(int i=0;i<input[i];i++) {
		System.out.println(""+input[i]);
		
	}
    
	}

}
