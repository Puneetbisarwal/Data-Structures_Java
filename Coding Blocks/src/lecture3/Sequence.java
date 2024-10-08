package lecture3;

import java.util.Currency;
import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter N = ");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		boolean goingdown=true; 
		System.out.print("Enter First Number = ");
int prev=sc.nextInt();
int i=2;

int goingDownCount=0;
int goingUpCount=0;
		while(i<=n)
		{
			int current =sc.nextInt();
			if(goingdown)
			{
				if(current>prev){
					goingdown=false;
				}
			}else{
				if(current<prev){
					System.out.println("No");
					sc.close();
					return;
				}
			}
		prev=current;
		i=i+1;
		}
		System.out.print("Yes");
		sc.close();
		return;
	}

}
