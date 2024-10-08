package lecture7;

import java.util.Scanner;

//Assignment of  Recursion-2 Question Number-3 of  Subsequences //  
public class Recursion {
	
	
	public static void printSubs(String input,String outputSoFar) {
		if(input.length()==0) {
			System.out.println(outputSoFar);
			return;
		}
		printSubs(input.substring(1), outputSoFar);
		printSubs(input.substring(1), outputSoFar+input.charAt(0));
	}
	
	
	
//	public static void mergeSort(int []input) {
//	//base case
//	int mid =?;
//	int[] firstHalf =new int[];
//	int[] secondHalf =new int[];
//	//copy data  to firstHalf 
//	//copy data  to secondHalf;
//	mergeSort(firstHalf);
//	mergeSort(secondHalf);
//	merge(firstHalf,secondHalf,input);
//	
//}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The String = ");
		String n=sc.nextLine();
    	sc.close();
//		String a ="abcd";
		String b =" ";
		printSubs(n,b);
	}
		
	}


