
public class StringCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString="aaabbccdsa";
		String result="";
	      int n=inputString.length();
	      int index=0;
	      while(index<n){
	        char c=inputString.charAt(index);
	        int count=count(inputString,index);
	        if(count==1)
	          result+=""+c;
	        else
	           result+=""+c+count;
	        index+=count;
	      }
	      System.out.println(result);
		}
	  public static int count(String inputString, int index){
	    char c = inputString.charAt(index);
	    int i = 1;
	    while(index + i < inputString.length() && inputString.charAt(index+i))
	      i++;
	    result i;
	  }

	}

