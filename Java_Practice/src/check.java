import java.util.Arrays;
public class check {
	
	  public static void main(String args[])
	    { 
		  int currentPosition = 0;
		  int d=4;
		  
		  int[] arr={2,6,3,1,5,9,8};
		  int l=arr.length;
		  int[] result=new int[l];
		  int[] end=new int[d];
	      for(int i=0;i<end.length;i++){
	        end[i]=arr[i];
	      }
	      for(int j=0;j<arr.length-d;j++){
	          arr[j]=arr[j+d];
	        }
	      for( int i = 0; i < arr.length-d; i++) {
	    	    result[currentPosition] = arr[i];
	    	    currentPosition++;
	    	}

	    	for( int j = 0; j < end.length; j++) {
	    	    result[currentPosition] = end[j];
	    	    currentPosition++;
	    	}
	    	for(int j=0;j<result.length;j++){
		         System.out.print(result[j]+" ");
		        }
	      
	    }
			    
			
		}

		  
	        

