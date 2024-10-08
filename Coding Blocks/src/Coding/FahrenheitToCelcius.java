/* Class 21 February 2016 */
package Coding;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fah =0;
		
//		System.out.print(5/9);
//		System.out.print(5.0/9);
		while(fah<=300)
		{
		int cel =(int)((5.0/9)*(fah-32));
		System.out.println(fah + "\t"+cel);
		fah=fah+20;
		
		
	}
	
	}
	
}

