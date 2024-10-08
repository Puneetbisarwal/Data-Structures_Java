package Coding;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class LargestOfThree {

	public static int findMaxOfThree(int firstNumber ,int secondNumber,int 	thirdNumber){
		
		if(firstNumber>=secondNumber && firstNumber>=thirdNumber)
		{
			return firstNumber;
		}
		else  if(secondNumber>=firstNumber && secondNumber >= thirdNumber)
			{
				return secondNumber;
				
			}
			else {
				return thirdNumber;
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);
	int firstNumber=s.nextInt();
	int secondNumber=s.nextInt();
	int thirdNumber=s.nextInt();
	
	int answer =findMaxOfThree(firstNumber,secondNumber,thirdNumber);
	System.out.print(answer);
	
	
	 /* if(firstNumber>=secondNumber && firstNumber>=thirdNumber)
	 {
		 System.out.print(firstNumber);
	  return;
	}
	 if(secondNumber>=firstNumber && secondNumber >= thirdNumber)
	 {
			System.out.print(secondNumber);
			return;
	 }
	 
	 System.out.print(thirdNumber);
	*/ 
	/* 
	 if(firstNumber>=secondNumber && firstNumber>=thirdNumber)
	{
		System.out.print(firstNumber);
	}
	else {
		if(secondNumber>=firstNumber && secondNumber >= thirdNumber)
		{
			System.out.print(secondNumber);
			
		}
		else {
			System.out.print(thirdNumber);
		}
	}*/
	
	}

}
