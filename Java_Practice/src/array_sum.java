
public class array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={1,3,6,2,5,4,3,2,4};
		int num=7;
		for(int j=0;j<arr.length;j++){
			for(int i=0;i<arr.length-1-j;i++){
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			}
			}
			
	            for(int i=0;i<arr.length;i++){
			       for(int j=0;j<arr.length;j++){
			         if(arr[i]+arr[j]==num){
			           System.out.print(arr[i]);
	                    System.out.println(arr[j]);
			         }
			       }
			     }
		}
	
	}


