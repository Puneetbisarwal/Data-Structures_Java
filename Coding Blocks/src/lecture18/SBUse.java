package lecture18;

public class SBUse {

	public static int String_Matching(String s, String s1) {

		if (s == null || s1 == null) {
			return 0;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s1.charAt(0)) {
				if (function(s.substring(i, i + s1.length()), s1)) {
					return i;
				}

			}
		}
		return -1;

	}

	public static boolean function(String s, String s1) {
		if (s.equals(s1))
			return true;
		return false;
	}

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");*/
		//System.out.println(sb);

		String str = "abcdefghi";
		String str1 = "ghi";
		System.out.print("String Matching = " + String_Matching(str, str1));

	}
}
