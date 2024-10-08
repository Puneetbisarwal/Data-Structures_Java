 package lecture7;

public class isStringPresent {
	
	public static boolean SubStr(String a,String b) {
		if(b.length()==0) {
			return true;
		}
		if(a.length()==0 ) {
			return false;
		}
		
		if(a.charAt(0)==b.charAt(0)) {
		return	SubStr(a.substring(1),b.substring(1));	
		}
		else
		return	SubStr(a.substring(1),b);
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String a= "abcdiojkduidjndhgkkl";
 String b="coding";
 System.out.print(SubStr(a, b));
	}

}
