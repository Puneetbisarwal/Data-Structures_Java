import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=num;i++){
			
				System.out.println("");
			
			int count=0;
			for(int j=i;j>=i;j++){
				++count;
				if(count<=i){
					System.out.print(j);
				}
				
			}
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
