import java.util.Scanner;

public class Sum_even_odd {

	public static void main(String[] args) {
		int num,a,sum1=0,sum2=0;
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
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
		
		// TODO Auto-generated method stub

	}

}
