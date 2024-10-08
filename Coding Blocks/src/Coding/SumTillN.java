/* Class 21 February 2016 */
package Coding;

import java.util.Scanner;

public class SumTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
System.out.print(sum);
	}

}
