package lecture5;


public class PowerFunction {

	//To Improved Space Complexity //
	public static long powerfun(int x,int n) {

		if(n==0) {
			return 1;
		}
		else {
			long ans= powerfun(x,n/2);
			ans=ans*ans;
			if(n%2==1) 
				return x*ans;
			else
				return ans;
		}
	}

		public static int power(int x,int n) {
			if(n==0) {
				return 1;
			} 
			int powerrfun =power(x,(n-1));
			return x*powerrfun; 
						
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(4,3));
		System.out.println(powerfun(4,3));
	}


}
