
public class mergeSortRecurssion {
	static void mergesort(int[] input){
	if(input.length==1){
		return;
	}
int[] leftarray=new int[input.length/2];
for(int i=0;i<leftarray.length;i++){
	leftarray[i]=input[i];
}
int[] rightarray=new int[input.length-leftarray.length];
for(int j=0;j<rightarray.length;j++){
	rightarray[j]=input[j];
}
mergesort(leftarray);
mergesort(rightarray);
merge(leftarray,rightarray,input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
