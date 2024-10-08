
public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr={2,13,4,1,3,6,28};
for(int i=0;i<arr.length;i++){
	for(int j=i;j>=1;j--){
	if(arr[j-1]<arr[j]){
		break;
	}
	else{
		int temp=arr[j];
		arr[j]=arr[j-1];
		arr[j-1]=temp;
	}
	
	}
}
for(int k=0;k<arr.length;k++){
	System.out.print(arr[k]);
	System.out.print(" ");


}

	}

}
