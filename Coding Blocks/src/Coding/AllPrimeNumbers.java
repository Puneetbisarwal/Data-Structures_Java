/* Class 21 February 2016 */
package Coding;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number = ");
		int n=sc.nextInt();
	for(i=2;i<=n-1;i++)
	{
		int flag = 0;
	
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag =1;
				System.out.println("The Number is Not Prime = "+i);
				return;	
			}
		}  
		
		if(flag==0)
		System.out.println("The Number is Prime = "+i);
		
	}
	sc.close();
}
}