//package lecture11;
//
//public class Merge_Sort_Linked_List {
//
//	
//	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
//		Node<Integer> resultHead =null;
//		Node<Integer> resultTail =null;
//	
//		if (head1.getData()<head2.getData()) {
//			resultHead=head1;
//			resultTail=head1;
//			head1=head1.next;
//		} else {
//			resultHead=head2;
//			resultTail=head2;
//			head2=head2.next;
//		}
//		while (head1 != null && head2 != null) {
//			if(head1.getData()<head2.getData()) {
//				resultTail.next=head1;
//			}
//		
//		}
//          	
//	}
//	
//	
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
