package lecture12;

public class StackUsingArray {
 private int[] data;
 private int nextIndex;
 
 public StackUsingArray( ) {
	 data=new int[10];
	 nextIndex=0;
 }
 
 public boolean isEmpty()
 {
	 return size()==0;
 }
 
 
 public int top () throws StackEmptyException  {
	 //size==0
	 return data[nextIndex-1];
 }
 
 public int size() {
	 return nextIndex;
 }
 
 public void push(int element ) throws StackFullException {
	 if(nextIndex==data.length) {
		 int [] temp=data;
		 data = new int [temp.length*2];
		 for(int i=0;i< temp.length;i++) {
			 data[i]=temp[i];
		 }
	 }
	 //nextIndex==100
	 data[nextIndex]=element;
	 nextIndex++;
 }
 
 
 public int pop () throws StackEmptyException {
	 if(size()==0) {
		 StackEmptyException e=new StackEmptyException();
		 throw e;
	 }
	 //size==0
	 nextIndex--;
	 int toBeReturned =data[nextIndex]; 
	 data[nextIndex]=0;
     return toBeReturned; 
 }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
