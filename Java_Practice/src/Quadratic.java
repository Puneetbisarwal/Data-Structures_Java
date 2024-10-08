import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		int a,b,c,X,Y;
		double D,R1,R2,A;
		Scanner s =new Scanner(System.in);
		   a =s.nextInt();
		   b =s.nextInt();
		   c =s.nextInt();
		  D= (b*b)-(4*a*c);
		   A=Math.sqrt(D);
		   R1=(((-b)+A)/2);
		   R2=(((-b)-A)/2);
		   X=(int)Math.round(R1);
		   Y=(int)Math.round(R2);
		   if(D>0){
			   System.out.println(1);
			   System.out.println(X+" "+Y);
		   }
		   if(D<0){
			   System.out.println(-1);
		   }
		   if(D==0){
			   System.out.println(0);
			   System.out.println(X+" "+Y);
		   }
		   
		   
		
		// TODO Auto-generated method stub

	}

}
