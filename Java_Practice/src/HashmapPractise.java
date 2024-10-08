import java.util.HashMap;
import java.util.Scanner;
public class HashmapPractise {
char getMaxFreqChar(String input){
	HashMap<Character,Integer> map=new HashMap<>();
	for(int i=0;i<input.length();i++){
		char ch=input.charAt(i);
		if(map.containsKey(ch));
		map.put(ch,map.get(ch)+1);
	}
	else{
		map.put(ch, 1);
	}
}
int max freq=0;
char ch;
for(Entry<Character,Integer> e: map.entrySet()){
	if(e.getValue(>maxfreq)){
		maxfreq=e.getValue();
	}
}
return ch;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		int count=0;
Scanner s= new Scanner(System.in);
String str="Hello";
//for(int i=0;i<str.length();i++){
//	
//}

	}

}
