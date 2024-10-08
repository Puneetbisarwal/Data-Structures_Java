package lecture5;

public class ArrayRecursion {
	
	public static boolean isSorted(int a[]) {
		if(a.length==0 || a.length ==1) {
			return true;
		}
		if(a[0]>a[1]){
			return false;
		}
		int b[]=new int[a.length-1];
		for(int i=1;i<a.length;i++) {
			b[i-1]=a[i];
		}
		//return isSorted(b);
		boolean isSmallerSorted = isSorted(b);
		if(isSmallerSorted) {
		return true;	
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={9,1,7,4,6,2,8};
		System.out.println(isSorted(a));
	}

}
