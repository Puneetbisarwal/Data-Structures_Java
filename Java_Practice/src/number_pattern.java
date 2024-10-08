import java.util.Scanner;
public class number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count = num - 1;
        for (int k = 1; k <= num; k++) {
            for (int i = 1; i <= count; i++){
                System.out.print(" ");
            }
            count--;
            for (int i = k; i <= 2 * k - 1; i++){
                System.out.print(i);
            
            for (int p = k; p < 2 * k - 1; p--){
                System.out.print(p);
            }
            }
            System.out.println();
   }
	}

}
//Scanner s= new Scanner(System.in);
//				int num=s.nextInt();
//		        int count = num - 1;
//		        for (int k = 1; k <= num; k++) {
//		            for (int i = 1; i <= count; i++)
//		                System.out.print(" ");
//		            count--;
//		            for (int i = 1; i <= 2 * k - 1; i++)
//		                System.out.print("*");
//		            System.out.println();
//		   }