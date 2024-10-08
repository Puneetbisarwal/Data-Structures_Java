
public class Aa1 {
	public static int caculateNextNumber(int number)
	{
		int digit=0;		
		int newNumber=0;
		int multiplier = 1;
		while(number> 0) 
		{	
			int count=0;
			do{
				digit = number%10;
				number = number/10;
				count++;
			}while(digit==number%10);
			newNumber=newNumber+(count*10+digit)*multiplier;
			multiplier*=100;
		}
		return newNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			int i,j,k;
//			for (i=5;i>=1;i--) {
//				for (j=1;j<=5;j++) {
//					if(j<=i)
//					        System.out.print(j); 
//					else
//					        System.out.print("*");
//				}
//				for (j=5;j>=1;j--) {
//					if(j<=i)
//						System.out.print(j);
//					else
//						System.out.print("*");
//				}
//				System.out.print("\n");
//			}
//			
//		
		int number = 1;
		for(int i =1;i<4;++i){
			number = caculateNextNumber(number);
			System.out.println(number);
		}
	}
}
	


		
