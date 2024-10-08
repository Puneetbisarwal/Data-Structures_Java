/* Class 21 February 2016 */
package Coding;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number = ");
		int n=sc.nextInt();
		int i=1;
		int col;
		int val=1;
		while(i<=n)
		{
			col = 1;
			while (col<=i)
			{
				System.out.print(val+" ");
				val++;
				col++;
				
			}
			System.out.println();
			i++;
			
		}

	}

}
