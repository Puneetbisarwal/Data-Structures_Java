import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	      char ch=s.next().charAt(0);
	      if('a'<=ch && ch<='z')
	      {  
	    	  System.out.println(0);
	      }
	      if('A'<=ch && ch<='Z')
	      {  
	    	  System.out.println(1);
	      }
	      else
	      {  
	    	  System.out.println(-1);
	      }
	      
	      
	      
		// TODO Auto-generated method stub

	}

}
