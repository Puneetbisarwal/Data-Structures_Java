import java.util.Scanner;
public class arrayEquil {
	  int equilibrium(int arr[], int n)
	    {
	        int sum = 0; // initialize sum of whole array
	        int leftsum = 0; // initialize leftsum
	 
	        /* Find sum of the whole array */
	        for (int i = 0; i < n; ++i)
	            sum += arr[i];
	 
	        for (int i = 0; i < n; ++i) {
	            sum -= arr[i]; // sum is now right sum for index i
	 
	            if (leftsum == sum)
	                return i;
	 
	            leftsum += arr[i];
	        }
	 
	        /* If no equilibrium index found, then return 0 */
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayEquil equi = new arrayEquil();
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
        int arr1[] = new int[num];
        for(int i=0;i<arr1.length;i++){
        	arr1[i]=s.nextInt();
        }
        int arr_size = arr1.length;
        System.out.println(equi.equilibrium(arr1, arr_size));
    }
}

