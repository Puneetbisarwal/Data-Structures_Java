package lecture12;

import java.util.Stack;

import lecture11.Node;

	public class StackUsing_Linked_List
	{
		private int size;
		private Node<Integer> head = null;
		
		public int size()
		{
			return size;
		}

		public boolean isEmpty()
		{
			return size() == 0;
		}

		public int top()
		{
			//nextIndex and size should not be equal to 0.
			return (int) head.getData();
		}

		public int push(int element)  // O(1)
		{
			// nextIndex should not be equal to 100
			// node will be constructed.
			// head.data = element;
			Node<Integer> newNode = new Node<>(element);
			//newNode.data = element;
				
			newNode.next = head;
			head = newNode;
			size++;
			return element;
		}
		
		
		
		public int pop() 
		{
			
			int toBeReturned = head.getData(); 
			head = head.next;
			size--;
			return toBeReturned;
			
		}
			
		public static void main(String[] args) {
			StackUsing_Linked_List obj = new StackUsing_Linked_List();
			System.out.println("The Push element is = "+obj.push(4));
			System.out.println( "The Pop element is = "+obj.pop());
			System.out.println("the Push element is = "+obj.push(5));
			
			}
	
}
