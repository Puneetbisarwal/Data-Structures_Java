import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=2;
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		while(i<num)
		{
			if(num%i==0)
			{
				System.out.println("Not Prime");
			}
              i++;
			
		}
		if(i==num){
			System.out.println("Prime");
		}
		// TODO Auto-generated method stub

	}

}
