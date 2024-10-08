package lecture5;

public class ArrayRecursion1 {
	
	public static int isContain(int a[],int n) {
		if(n==a.length ) {
			return 0;
		}
			if(a[n]==7) {
				return n;
			}				
		return isContain(a,n+1);
	}
	
	
	public static int isFirst(int a[],int n) {
		if(n==a.length ) {
			return 0;
		}
			if(a[n]==7) {
				return n;
			}				
		return isFirst(a,n+1);
	}
	// returns returns the first index of 7 in array  a between startIndex to the end of array
	
	public static int firstIndexWithBeginIndex(int a[],int startIndex) {
		if(startIndex ==a.length) {
			return -1;
		}
		if(a[startIndex] ==7) {
		return	startIndex ;
		}
		int smallAnswer = firstIndexWithBeginIndex(a,startIndex+1);
		return smallAnswer;
	}
	
	//returns the first index of 7 in array a
	public static int firstIndex(int a[]) {
		if(a.length==0){
			return -1;
		}
			if(a[0]==7) {
				return 0;
			}	
			int [] smallerArray = new int [a.length-1];
			for(int i=1;i<a.length;i++) {
				smallerArray[i-1] =a[i];
			}
			int smallAnswer =firstIndex(smallerArray);
			if(smallAnswer ==-1) {
				return -1;
			} else {
				return smallAnswer +1;
				
			}	
	}
	
	
	
	public static int isLast(int a[],int n,int x) {
			if(n==a.length ) {
				return x;
			}
			
				if(a[n]==7) {
					x= n;		
				}	
			
			return isLast(a,n+1,x);
		}
		
	
	public static int lastIndex(int a[]) {
		if(a.length==0) {
			return -1;
		}	
		
		int [] smallerArray = new int [a.length-1];
		for(int i=1;i<a.length;i++) {
			smallerArray[i-1] = a[i];
		}
		int smallerLastIndex  =lastIndex(smallerArray);
		if(smallerLastIndex!=-1) {
		return smallerLastIndex;	
		} else {
			if(a[0]==7) {
				return 0;
			} else {
				return -1;
			}
		}
	}
	
	public static int []isAll(int a[],int n,int b[],int x ) {
		if(n==a.length ) {
		b[x]=-1;	
	return b;
		}
		else {
			
			if(a[n]==7){
				b[x]=n;
			return isAll( a, n+1, b, x +1);
		}
		 
		return isAll( a, n+1,b,x);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]  ={1,2,7,7,7,7};
 int b[]= new int [a.length+1];
 System.out.println(isContain(a,0));
 System.out.println(isFirst(a,0));
 System.out.println(firstIndex(a));
 System.out.println(isLast(a,0,-1));
 System.out.println(lastIndex(a));
 b=isAll(a,0,b,0);
 int i=0;
 while(b[i]!=-1){
	 System.out.print(b[i]+" ");
 i++;
 }
	}

}
