
public class subsequence {
static String[] subSequence(String input){
	if(input.length()==0){
		String[] arr={""};
		return arr;
	}
	String[] smallans=subSequence(input.substring(1));
	
	String[] ans=new String[smallans.length*2];
	for(int i=smallans.length-1;i>=0;i--){
	ans[i]=smallans[i];
	}
	for(int j=smallans.length-1;j>=0;j--){
		ans[j+smallans.length]=input.charAt(0)+smallans[j];
		
	}
	return ans;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ar=subSequence("abc");
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}

}
