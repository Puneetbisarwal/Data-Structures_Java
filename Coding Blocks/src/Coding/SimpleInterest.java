/* Class 21 February 2016 */
package Coding;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p,r,t;
		
Scanner sc =new Scanner(System.in);
        System.out.print("Enter P= ");
        p=sc.nextInt();
        System.out.print("Enter R= ");
        r=sc.nextInt();
        System.out.print("Enter T= ");
		t=sc.nextInt();
		
int  si=p*r*t/100;

System.out.print("Simple Interest = " +si);
		sc.close();		
	}

}
