package lecture3;

public class StringUse {
	
	public static void printDifferentLines(String s)
	{
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
	}
//	public static boolean isPalindrome(String s){
//		int startIndex=0;
//		int lastIndex=s.length()-1;
//		while(startIndex<lastIndex){
//			if(s.)
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc="Coding Blocks";
		abc=abc+"hey";
		System.out.println(abc);
		System.out.println(abc.charAt(0));
		System.out.println(abc.substring(3,6));

		String def=abc+"hey";
		System.out.print("hey"+10+"dd");
	}

}
