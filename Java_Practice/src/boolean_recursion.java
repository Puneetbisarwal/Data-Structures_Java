
public class boolean_recursion {
	 static boolean search7index(int[] input ){
		if(input.length==0){
			return false;
		}
		if(input[0]==7){
			return true;
		}
		int [] SmallArray=new int[input.length-1];
		for(int i=0;i<SmallArray.length;i++){
			SmallArray[i]=input[i+1];
		}
		boolean smallans=search7index(SmallArray);
		return smallans;
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int[] arr1={1,2,3,5,8,9,7,4,1};
	boolean a=search7index(arr1);
	System.out.println(a);
		}

	}
