import java.util.Scanner;
public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	      int in =s.nextInt();
	      int max=s.nextInt();
	      int diff=s.nextInt();
	       while(in<=max){
	      int F=(int)((5/9)*(in-32));
	        System.out.print(in+"\t"+F);
	        System.out.println("");
	        in=in+diff;
	      }
			
	}

}
//int C;
//int F = 0;
//
//Scanner s= new Scanner(System.in);
//int max = s.nextInt();
//while (F <= max) {
//	C = (int) ((5.0 / 9) * (F - 32));
//	System.out.println(F + "\t" + C);
//	F = F+20;
//}
//}