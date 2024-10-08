package lecture7;

import java.util.Scanner;

public class Polynomial {
	
	public static int Poly(int [] a,int x) {
		int x_component=1;
		int res	=0;
		for(int i=0;i<a.length;i++) {
		 res= res +a[i]*x_component;
		x_component=x_component*x;
		
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the Array Size  = ");
		Scanner sc=new Scanner(System.in);	
		int s = sc.nextInt();
		int[] arr=new int[s];
		for(int i=0;i<s;i++) {
			  arr[i]=sc.nextInt() ;
		 }
		int a=5;
		int ans = Poly(arr,a);
		
		System.out.println("Answer of the Polynomial is = "+ans);
		
		

	}

}
