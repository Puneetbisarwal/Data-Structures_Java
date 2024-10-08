
package lecture3;

import java.util.Scanner;

public class SquareRoot {
	
	
	
	
	public static long factorial(int n){
		
		long output =1;
		int i=1;
		while(i<=n){
			
			output=output*i;
			i++;
		}
	return output;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		long ans=factorial(6);
		System.out.println(ans);
		
		double answer=0;
		System.out.println("Enter Number and Decimal Point = ");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int d=sc.nextInt();
		double increment =1;
		int currentDecimalPoint=0;
		while(currentDecimalPoint<=d){
			while(answer*answer<=n){
				answer=answer+increment;
				System.out.println(answer);
			}
			answer=answer-increment;
			System.out.println(answer);
			currentDecimalPoint++;
			increment=increment*0.1;
		}
//		double increment =1;
//		int i=1;
//		while(i<=d){
//			increment=increment*0.1;
//			i++;
//		}
//
//		while(answer*answer<=n){
//			answer=answer+increment;
//		}
//		answer= answer-increment;
//		System.out.println(answer);
	}

}
