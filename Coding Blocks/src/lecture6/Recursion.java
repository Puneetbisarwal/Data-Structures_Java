package lecture6;

import java.util.Scanner;

public class Recursion {
	
	// Assignment Question-11 of Recursion-Assignment1 //
	public static void towerOfHanoi(int n,char firstTower,char secondTower ,char thirdTower) {
		if(n==1) {
			System.out.println("Move 1st ring from "+firstTower +"to " + thirdTower);
			return;
		}
		towerOfHanoi(n-1, firstTower, thirdTower, secondTower);
		System.out.println("Move "+n +"th ring from  " + thirdTower);
	}
	

	// Assignment Question-6 of Recursion-Assignment1 //
	
	public static String insertStar2(String input) {
		if (input.length()==0 ||  input.length()==1) {
			return input;
		}
		if (input.charAt(0)==input.charAt(1)) {
			return input.charAt(0) + "*" + insertStar2(input.substring(1));
		} else {
			return input.charAt(0) + insertStar2(input.substring(1));
		}
	}
	
	
	
	public static String insertStar(String input) {
		if (input.length()==0 ||  input.length()==1) {
			return input;
		}
		
		
		String smallerOutput =insertStar(input.substring(1));
		if (input.charAt(0)==input.charAt(1)) {
			return input.charAt(0) + "*" + smallerOutput;
		}  else {
			return input.charAt(0) + smallerOutput;
		}
	}
	
	// Assignment Question-7 of Recursion-Assignment1 //
	
	public static int sToI(String input) {
		
		if (input.length()==1) {
			return input.charAt(0) - '0';
 		}
		int smallerOutput =sToI(input.substring(0,input.length()-1));
		int lastDigit = input.charAt(input.length()-1)-'0';
		return smallerOutput *10 +lastDigit;
	}
	
	
	
	
	

	public static String [] subsequences(String input) {
		if(input.length()==0) {
			String[] output ={""};
			return output ;
		}

		String[] smallerOutput =subsequences(input.substring(1));

		String[] output =new String[2*smallerOutput.length];
		for(int i=0; i<smallerOutput.length;i++) {
			output[i] =smallerOutput[i];
		}

		for(int i=0; i<smallerOutput.length;i++) {
			output[i+smallerOutput.length] =input.charAt(0) +smallerOutput[i];
		}
		return output;
	}


	
	
	public static String getOptions( int i ) {
		if(i==2) {
			return "abc";
					
		} 
		if(i==3) {
			return "def";
					
		} 
		if(i==4) {
			return "ghi";
					
		}
		if(i==5) {
			return "jkl";
					
		}
		if(i==6) {
			return "mno";
					
		}
		if(i==7) {
			return "pqrs";
					
		}
		if(i==8) {
			return "tuvw";
					
		}
		if(i==9) {
			return "xyz";
					
		}
		System.out.println(" Ïnvalid Input ");
        return " ";	
	}
	
	
	
	public static  String [] sequence(String x) {
			if(x.length() ==0) {
				String[] output ={" "};
				return output;
				}
			
      		String[] smallerOutput =sequence(x.substring(1));
      		String str=getOptions(x.charAt(0)-'0');
			String[] output =new String[smallerOutput.length*str.length()];
			
			int k=0;
			for(int i=0; i<smallerOutput.length;i++)
			{
				for(int j=0; j<str.length();j++)
				{
					output[k] =str.charAt(j)+smallerOutput[i];
				k++;
				}
			}
					
	        return output;
				
			}


	
	
	public static  void  permutation(String perm, String result) {
		if (result.isEmpty())
		{
			System.out.println(perm);
		}
		else {
			for(int i=0;i<result.length();i++)
			{
				permutation(perm + result.charAt(i), result.substring(0, i) + result.substring(i+1, result.length()));
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p= "abc";
		permutation("",p);
		
		System.out.println("Enter the Number  = ");
		Scanner sc=new Scanner(System.in);	
		String s = sc.nextLine();
        sc.close();
		String[] ans = sequence(s);
				for(int i=0;i< ans.length;i++)
				{
				System.out.println(ans[i]);
				}
	
	}

}
