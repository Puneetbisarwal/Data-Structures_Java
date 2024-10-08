
public class recursion {
static int search7index(int[] input ){
	if(input.length==0){
		return -1;
	}
	if(input[0]==7){
		return 0;
	}
	int [] SmallArray=new int[input.length-1];
	for(int i=0;i<SmallArray.length;i++){
		SmallArray[i]=input[i+1];
	}
	int smallans=search7index(SmallArray);
	return smallans+1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1={1,2,3,5,8,9,7,4,1};
int a=search7index(arr1);
System.out.println(a);
	}

}
