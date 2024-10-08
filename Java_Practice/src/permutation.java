
public class permutation {
static String[] permutation(String input){
	if(input.length()==0){
		String[]arr={""};
		return arr;
	}
	String[] smallans=permutation(input.substring(1));
	String[] ans= new String [smallans.length*(smallans[0].length()+1)];
	int k=0;
	for(int i=0;i<smallans.length;i++){
		String word=smallans[i];
		for(int j=0;j<=word.length();j++){
		ans[k++]=	word.substring(0,j)+input.charAt(0)+word.substring(j);
			
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]ar1= permutation("abc");
		 for(int i=0;i<ar1.length;i++){
			 System.out.println(ar1[i]);
		 }
	}

}
