package lecture12;

public class QueueUsing_Linked_List <T> {
	
	public T data;
	public int size;
	public QueueUsing_Linked_List<T> head,tail,next;
	public QueueUsing_Linked_List<T> front(){
		return head;
	}
	public void enqueue(T x){
		QueueUsing_Linked_List<T> Q=new QueueUsing_Linked_List<T>();
		Q.data=x;
		Q.next=null;
		if(head==null){
			tail=head=Q;
			
		}
		else{
			tail.next=Q;
			tail=Q;
		}
		size++;
	}
	public T dequeue() throws QueueEmptyException{
		if(head==null){
			QueueEmptyException e=new QueueEmptyException();
			throw e;
		}
		else{
		T x=head.data;
			head=head.next;
			return x;
		}
	}
	public int Size(){
		return size;
	}
	public boolean IsEmpty(){
		if(head==null)
			return true;
			else
				return false;
	}
	}
