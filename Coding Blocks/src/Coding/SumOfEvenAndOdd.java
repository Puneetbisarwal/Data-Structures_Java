/* Class 21 February 2016 */
package Coding;

import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,sum=0, sum1=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number = ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
		{
			sum =sum+i;
			System.out.print("Sum of Even = "+sum+"\n");
		}
			
			else		
			{			
				sum1=sum1+i;
			    System.out.print("Sum of Odd = "+sum1+"\n");
		    }
		}				
	}
		


}
