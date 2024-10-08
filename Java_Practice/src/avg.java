import java.util.Scanner;
public class avg {

	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
	      char name=s.next().charAt(0);
	      int F =s.nextInt();
	       int a=s.nextInt();
	       int t =s.nextInt();
	       int c=F<a?F:a;
     int b=c<t?c:t;
     int avg;
     System.out.print(name+" ");
     avg=(int)(F+a+t-b)/2;
     System.out.print(avg);

	       
	     
		// TODO Auto-generated method stub

	}

}
