package lecture7;

import java.util.Scanner;

public class Permutation {

	public static  String[]  permutation( String input) {
		if (input.isEmpty())
		{
			String[] output ={""};
			return output ;		
		}
		String [] out =new String[(int)factorial(input.length())];
		 int k=0;
			for(int i=0;i<input.length();i++)
			{
				Character firstChar = input.charAt(i);
				String smaller[]=permutation( input.substring(0, i) + input.substring(i+1));
				for(int j=0;j<smaller.length;j++) {
					out[k] =firstChar +smaller[j];
					k++;
				}
			}
			return out;
		
	}
	
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
		String p= "abcd";
	
		String [] arr=permutation(p);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		

	}

}
