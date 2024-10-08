package lecture20;

public class fib {

	public static int fibI(int n) {

		int first = 0;
		int second = 1;
		int i = 0;
		while (i < n) {
			int next = first + second;
			first = second;
			second = next;
			i++;
		}
		return first;
	}

	public static int getMinimumMatrixOperation(int array[] ,int startIndex,int endIndex) {
		if(startIndex+1>=endIndex) {
			return 0;
		}
		int minNumber=Integer.MAX_VALUE;
		int sum=0;
		for(int i=startIndex+1;i<endIndex;i++) {
			sum=getMinimumMatrixOperation(array, startIndex, i);
			sum+=getMinimumMatrixOperation(array,i, endIndex);
			sum+=array[startIndex]*array[i]*array[endIndex];

			if(minNumber>sum) {
				minNumber=sum;
			}
		}
		return minNumber;
	}




//	public static int getMinimumMatrixOperationHelper(int array[] ,int startIndex,int endIndex,int [] output) {
//
//		if(startIndex+1>=endIndex) {
//			return 0;
//		}
//		
//	
//	}








	public static int editDistanceDPI(String s, String t) {

		int m=s.length();
		int n=t.length();
		int output[] [] = new int [m+1][n+1];
		output[0][0]=0;

		for(int i=0;i<=m;i++) {
			output[i][0]=i;
		}

		for(int j=0;j<=n;j++) {
			output[0][j]=j;
		}

		for(int i=1;i<=m;i++) {

			for(int j=1;j<=n;j++) {

				if(s.charAt(m-i)==t.charAt(n-j)) {
					output[i][j]=output[i-1][j-1];	
				}
				else {
					output[i][j]=1+Math.min(output[i-1][j],output[i][j-1]);
				}
			}

		}
		return output[m][n];
	}


	private static int editDistanceHelper(String s, String t, int[][] output) {


		if (s.length() == 0) {
			return t.length();
		}

		if (t.length() == 0) {
			return s.length();
		}

		int m = s.length();
		int n = t.length();


		if (output[m][n] > -1) {
			return output[m][n];
		}
		if (s.charAt(0) == t.charAt(0)) {
			output[m][n] = editDistanceHelper(s.substring(1), t.substring(1),output);
		} else {
			int a = editDistanceHelper(s.substring(1), t,output);
			int b = editDistanceHelper(s.substring(1), t.substring(1),output);
			int c = editDistanceHelper(s, t.substring(1),output);
			int value = Math.min(a, Math.min(b, c));
			output[m][n] = 1 + value;
		}
		return output[m][n];
	}

	public static int editDistanceBetter(String s, String t) {
		int[][] output = new int[s.length() + 1][t.length() + 1];
		for(int i=0;i<=s.length();i++) {
			for(int j=0;j<=t.length();j++) {
				output[i][j]=-1;	
			}
		}
		return editDistanceHelper(s, t, output);
	}
	
	

	public static int editDistance(String s, String t) {



		if (s.length() == 0) {
			return t.length();
		}

		if (t.length() == 0) {
			return s.length();
		}

		if (s.charAt(0) == t.charAt(0)) {
			return editDistance(s.substring(1), t.substring(1));
		}

		else {
			int a = editDistance(s.substring(1), t);
			int b = editDistance(s.substring(1), t.substring(1));
			int c = editDistance(s, t.substring(1));
			int value = Math.min(a, Math.min(b, c));
			//			int value=Math.min(a,b);
			//			int minimun=Math.min(value,c);
			//	   		return 1+minimum;
			return 1 + value;

		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String t="abd";
		String a="abcd";
		String b="acdb";
		int array [] ={4,5,10,8};
		System.out.println(fibI(50));
		System.out.println("Edit Distance = "+editDistance(a,b));
		System.out.println("Edit Distance Better = "+editDistanceBetter(s, t));
		System.out.println("Edit Distance DPI = "+editDistanceDPI(a,b));
		System.out.println("Minimum Matrix Operation = "+getMinimumMatrixOperation(array,0,3));

	}
}
