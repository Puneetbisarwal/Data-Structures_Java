import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		  int basic =s.nextInt();
	      char ch=s.next().charAt(0);
	      int totalsal;
		int allow=0;
   double hra,da,pf;
   hra=0.20*basic;
   da=0.50*basic;
   if(ch=='A'){
     allow=1700;
   }
   else if(ch=='B'){
     allow=1500;
   }
   else if(ch>'Ç'||ch=='A'){
     allow=1300;
   }
   pf=0.11*basic;
   totalsal=(int)Math.round(basic+hra+da+allow-pf);
   System.out.println(totalsal);
 }
}
