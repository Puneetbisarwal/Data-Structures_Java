import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	      
	      int n =s.nextInt();
	      int i,j;
	      System.out.println(1);
	      for(i=0;i<n-1;i++){
	    	  System.out.print(i+1);
	    	  for(j=0;j<i;j++){
	    		  System.out.print(0);
	    		  
	    	  }
	    	  System.out.print(i+1);
	    	  System.out.println();
	    	  
	      }
		
		// TODO Auto-generated method stub

	}

}
