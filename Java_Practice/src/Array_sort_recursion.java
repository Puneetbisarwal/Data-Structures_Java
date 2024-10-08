
public class Array_sort_recursion {
	static boolean sort(int[] input,int index ){
		if(input.length==index||input.length-1==index){
			return true;
		}
		if(input[index]>input[index+1]){
			return false;
		}
	return sort(input,index+1);	
	}
	static int[] allindex7(int[] input, int index ){
	
		if(input.length==index){
			int[] ar1={};
			return ar1 ;
		}
		
		    int[] Smallans= allindex7(input,index+1);
		    if(input[index]==7){
				int[] ans=new int[Smallans.length+1];
				ans[0]=index;
				for(int i=0;i<Smallans.length;i++){
					ans[i+1]=Smallans[i];
				}
				return ans;
			}
		    return Smallans;
	     }
	static int lastIndex7(int []input,int index){
		if(input.length==index){
			return -1;
		}
		int ans=lastIndex7(input,index+1);
		if(ans==-1){
			if(input[index]==7){
				ans=index;
			}
		}
		return ans;
	}
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int[] arr1={1,7,7,7,7,7,7,2,7,3,5,7,8,9};
	int i=0;
	int[] a=allindex7(arr1,i);
	for(int p=0;p<a.length;p++)
	System.out.print(a[p]+" ");
		}

	}
