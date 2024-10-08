/* Class 21 February 2016 */
package Coding;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number = ");
		int n=sc.nextInt();
		n=n-2;
		System.out.print(a+"\t"+b);
		for(int i=1;i<=n;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print("\t"+sum);
		}
	}

}
