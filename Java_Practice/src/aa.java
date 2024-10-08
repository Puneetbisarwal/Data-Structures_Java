import java.util.Scanner;
public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int num=sc.nextInt();
	      for(int j=1;j<=num;j++){
	    	  for(int i=num;i>0;i--){
	    		  if(j==i){
	    			  System.out.print("*");
	    			  continue;
	    		  }
	    		  System.out.print(i);
	    		 
	    	  }
	    	  System.out.println("");
	      }
	}

}
