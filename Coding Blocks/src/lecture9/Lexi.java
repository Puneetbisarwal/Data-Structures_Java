package lecture9;

import java.util.Scanner;

public class Lexi {

	public static void printLexicographical(int n) {
		for (int i=1;i<=9;i++) {
			printLexicographicalHelper(n,i);
		}
	}
	private static void printLexicographicalHelper(int n,int numSoFar) 
	{

		if(numSoFar>n) {
			return;
		}

		System.out.println(numSoFar);
		for (int i=0;i<10;i++) {
			printLexicographicalHelper(n, numSoFar*10+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;

		System.out.print("Enter the Number = ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		printLexicographical(s);
	}

}
