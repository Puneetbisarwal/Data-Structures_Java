//package lecture13;
//
//import lecture11.Node;
//import lecture12.StackUsing_Linked_List;
//
//public class StackUsingQueue {
//	QueueUsingArray primary;
//	QueueUsingArray secondary;
//	
//		
//	public int size()
//	{
//		return primary.size();
//	}
//
//	public boolean isEmpty()
//	{
//		return size() == 0;
//	}
//
//
//	private void checkEmpty() throws QueueEmptyException {
//		if( primary.size()==0) {
//			QueueEmptyException e=new QueueEmptyException();
//			throw e;
//		}
//	}
//
//	
//	public int front() throws QueueEmptyException {
//		checkEmpty();
//		return primary.size();
//	}
//
//	public int dequeue() throws QueueEmptyException {
//		checkEmpty();
//		int output=data[firstElementIndex];
//		size--;
//		data[firstElementIndex]=0;
//		firstElementIndex= (firstElementIndex+1)%data.length;
//		if( size==0) {
//			firstElementIndex=-1;
//			nextElementIndex=0;
//			size=0;
//		}
//		return output;
//	}
//	
//	public void enqueue(int element) {
//		if( size==data.length) {
//		int temp[]=data;
//		data=new int [data.length*2];
//		int k=0;
//		for (int i=firstElementIndex;i<temp.length;i++) {
//			data[k]=temp[i];
//			k++;
//		}
//		for (int i=0;i<firstElementIndex;i++) {
//			data[k]=temp[i];
//			k++;
//		}
//		firstElementIndex=0;
//		nextElementIndex=temp.length;
//		}
//		
//		if(size==0) {
//			firstElementIndex=0;
//		}
//		data[nextElementIndex]=element;
//		size++;
//		nextElementIndex=(nextElementIndex + 1) %data.length;
//		}
//}
