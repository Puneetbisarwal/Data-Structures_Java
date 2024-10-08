import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i=1;
		int gcd;
		int First= s.nextInt();
		int Sec= s.nextInt();
		if(First<=0 || Sec<=0){
			System.out.println("invalid");
		}
		while(i<=First&&i<=Sec){
		if(First%i==0 && Sec%i==0){		
			System.out.println(i);
		}
		
			i++;
		}
		
		
		// TODO Auto-generated method stub

	}

}
