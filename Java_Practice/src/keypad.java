import java.util.Scanner;
public class keypad {
	static String mapping(int i){
	String arr[]={"","","ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"};
	return arr[i];
	}
	static String[] keypad(int n){
		 if(n==0){
			String[] arr={""}; 
			return arr;
		 }
		 
String[]smallans=keypad(n/10);
String words=mapping(n%10);
String[] result=new String[words.length() *smallans.length];
int k=0;
for(int i=0;i<words.length();i++){
	for(int j=0;j<smallans.length;j++){
		result[k++]=smallans[j]+words.charAt(i);
	}
		
}
return result;
 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int num=s.nextInt();
 String[]ar1= keypad(num);
 for(int i=0;i<ar1.length;i++){
	 System.out.println(ar1[i]);
 }
	}

}
