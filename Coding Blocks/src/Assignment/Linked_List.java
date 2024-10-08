package Assignment;

import lecture11.Node;

public class Linked_List {
	
		//Q_1
		public static Node<Integer> insertAt(Node<Integer> head, int position, int data) {
			if (position == 0) {
				Node<Integer> newNode = new Node<Integer>(data);
				newNode.next = head;
				return newNode;
			}
			head.next = insertAt(head.next, --position, data);
			return head;
		}

		//Q_2
		public static Node<Integer> delete(Node<Integer> head, int position) {
			if (position == 0) {
				return head.next;
			}
			head.next = delete(head.next, --position);
			return head;
		}
		
		
		//Q_14
		public static Node<Integer> reverse_k(Node<Integer>head,int k) {
			Node<Integer> curr = head;
			Node<Integer> prev = null;
			Node<Integer> fwd = null;
            
			int count=0;
			while (count<k && curr != null) {
				fwd = curr.next;
				curr.next = prev;
				prev = curr;
				curr = fwd;
				count++;
			}
			
			if(curr!=null) {
             head.next=reverse_k(curr, k);
			}
			return prev;
			
		} 
		
		
		
		
		//Q_10 using iteration
		public static Node<Integer> reverse_I(Node<Integer> head) {
			Node<Integer> curr = head;
			Node<Integer> prev = null;
			Node<Integer> fwd = null;

			while (curr != null) {
				fwd = curr.next;
				curr.next = prev;
				prev = curr;
				curr = fwd;
			}

			return prev;
		}
		
		
		
		
		//Q_10 using recursion
		public static Node<Integer> reverse_R(Node<Integer> head) {
			if (head.next == null) {
				return head;
			}

			Node<Integer> finalHead = reverse_R(head.next);
			head.next.next = head;
			head.next = null;
			return finalHead;
		}

		private static int length(Node<Integer> head) {
			int count = 0;
			while (null != head) {
				head = head.next;
				count++;
			}
			return count;
		}
		
		// bubblesort recursively
		public static Node<Integer> bubbleSort(Node<Integer> head) {
			int n = length(head);
			if (head == null || head.next == null) {
				return head;
			}
			head.next = bubbleSort(head.next);
			// for (int i = 0; i < n - 1; i++) {
			Node<Integer> prev = null;
			Node<Integer> curr = head;
			for (int j = 0; j < n - 1; j++) {
				// while (curr != null && curr.next != null) {

				if (curr.getData() <= curr.next.getData()) {
					prev = curr;
					curr = curr.next;
				} else {
					if (prev == null) {
						Node<Integer> fwd = curr.next;
						head = head.next;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					} else {
						Node<Integer> fwd = curr.next;
						prev.next = fwd;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					}
				}
			}
			// }
			return head;

		}

		
		public static void printLL(Node<Integer> head) {
			while (head != null) {
				System.out.print(head.getData() + "-->");
				head = head.next;
			}
		}

		public static void main(String[] args) {
			Node<Integer> head1 = new Node<Integer>(1);
			head1.next = new Node<Integer>(9);
			head1.next.next = new Node<Integer>(2);
			head1.next.next.next = new Node<Integer>(8);
			head1.next.next.next.next = new Node<Integer>(0);
			head1.next.next.next.next.next = new Node<Integer>(11);
			head1.next.next.next.next.next.next = new Node<Integer>(3);
			head1.next.next.next.next.next.next.next = new Node<Integer>(10);
			head1.next.next.next.next.next.next.next.next = new Node<Integer>(1);

			printLL(head1);
			System.out.println();
			head1 = reverse_R(head1);
			printLL(head1);

		}

	}


