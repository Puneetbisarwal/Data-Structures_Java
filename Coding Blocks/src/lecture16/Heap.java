package lecture16;

import java.util.PriorityQueue;

public class Heap  {
	
	
public static void Heap (int arr[],int k) {
PriorityQueue<Integer> a=new PriorityQueue<Integer>();

for(int i=0;i<k;i++)
{	
a.add(arr[i]);
}

for(int j=k;j<arr.length;j++)
{	
if(arr[j]>a.peek()) {
	a.remove();
	a.add(arr[j]);
}
}

for(int i=0;i<k;i++) 
{
	int w=a.remove();
	System.out.println(w);
}

}
 

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[]= {9,8,7,6,5,4,3,2,1};
    int k=5,i;
    Heap(arr, 9);
    
    
}
}