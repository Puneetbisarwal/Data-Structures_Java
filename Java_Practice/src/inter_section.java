
public class inter_section {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1={10,9,8,7,6,5,4,3,2,1};
		int []arr2={100,90,80,70,60,50,40,30,20,10};
		 for(int i=0;i<arr1.length;i++){
		       for(int j=0;j<arr2.length;j++){
		         if(arr1[i]==arr2[j]){
		           System.out.println(arr1[i]);
		         }
		       }
		     }

	}
}

