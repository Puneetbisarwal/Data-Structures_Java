import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int i=1,j=1,sum;
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		
		while(i<num)
		{
			sum=i+j;
			System.out.print(i+" " );
			i=j;
			j=sum;
		}
		if(i>num){
			System.out.println(" NOt MEMBEr");
		}
		else{
			System.out.println(" Member");
		}
		
		// TODO Auto-generated method stub

	}

}
