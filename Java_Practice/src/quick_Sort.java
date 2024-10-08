import java.util.Scanner;
public class quick_Sort {
	static void QuickSort(int[] arr,int start,int end){
		if(start<end){
			int pivot=end;
			partition(arr,start,end);
			QuickSort(arr,start,pivot-1);
			QuickSort(arr,pivot+1,end);
		}
	}
	static void()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int[] arr={0,5,6,8,7,4};
QuickSort(arr,0,arr.length()-1);

	}

}
