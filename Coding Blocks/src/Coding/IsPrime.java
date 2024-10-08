/* Class 21 February 2016 */
package Coding;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number = ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print("The Number is Not Prime \n");
				return;
			}
			
		}
		
		System.out.println("The Number is Prime");
		sc.close();
		
	}

}
