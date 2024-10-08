package lecture5;

import java.util.Scanner;

public class Recursion1 {



	public static int factorial(int n) {
		if(n==0){
			return 1;
		}
		int factNMinusOne=factorial(n-1);
		return n*factNMinusOne;
	}

	public static int fib(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
              return fib(n-1)+fib(n-2);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fib(7));
		System.out.println(factorial(5));
		
	}
}
