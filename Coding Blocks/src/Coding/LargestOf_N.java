/* Class 21 February 2016 */
package Coding;

import java.util.Scanner;

public class LargestOf_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number = ");
		int n=sc.nextInt();
		long max=-1000;
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter The Next  Number = ");
			int next =sc.nextInt();
			
			if(next >= max)
			{
				max=next;
			}
		}
	System.out.print("Maximum Number is = "+max);
	}
	

}
