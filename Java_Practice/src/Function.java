import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		int num;
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		sum_even_odd(num);
		// TODO Auto-generated method stub

	}
	 static void sum_even_odd(int num){
		int a,sum1=0,sum2=0;
		
		while(num>0){
			a=num%10;
		if(a%2==0)	{
			sum1=(sum1+a);
		}
		else{
			sum2=(sum2+a);
		}
		num=num/10;
			
		}
		System.out.println(sum1+" "+sum2);
	}

}
