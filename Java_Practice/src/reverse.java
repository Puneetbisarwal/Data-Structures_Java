import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
      int n=0,rev=0;
      while(num!=0){
        n=num%10;
        rev=(rev*10)+n;
        num=num/10;    
      }
      System.out.print(rev);
	}

}
