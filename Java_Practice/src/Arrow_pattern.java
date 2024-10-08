import java.util.Scanner;
public class Arrow_pattern {
	  public static void main(String args[])
	    {   
		  Scanner s =new Scanner(System.in);
		  int p = s.nextInt();
		  int a=p;
	 
		  int z=a;
		  int n=(int)(a/2);
		  for (int i = 1; i <= n; i++) {
		        for (int j = 0; j < i; j++) {
		            System.out.print(" ");
		        }
		        for (int k = 0; k < i; k++) {
		            System.out.print("* ");
		        }
		        System.out.println();
		    }
		  int y=(int)(a/2);
		  int x=z-y;
		    for (int i=0; i<x; i++) {
		        
		        for (int j = 0; j <x-i; j++) {
		            System.out.print(" ");
		        }
		        
		        for (int k = 0; k <x-i; k++) {
		            System.out.print("* ");
		        }
		        System.out.println();
		    }
		}
}

		  
