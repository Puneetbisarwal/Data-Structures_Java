package lecture8;

public class Check_Palindrome {

	public static int palin_count(String s) {
		if(s.length()==0) {
			return 0;
		} 
		else {
			int i=0,j=0,k=0,ans=0;
			for(k=0;k<s.length();k++) {
				i=k;
				j=k;
				while(i>=0&&j<s.length()) {
					if(s.charAt(i)==s.charAt(j)) {
						ans++;
						System.out.println(" "+i+" "+j);
					}
					else
						break;
					i--;
					j++;
				}
				
				//For even
				
				i=k;
				j=k+1;
				while(i>=0&&j<s.length()) {
					if(s.charAt(i)==s.charAt(j)) {
						ans++;
						System.out.println(" "+i+" "+j);
					}
					else
						break;
					i--;
					j++;
				}
			}
			return ans;
		}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="acbabbabc";
System.out.println("Total Number of Palindrome in SubString = "+palin_count(s));
	}

}
