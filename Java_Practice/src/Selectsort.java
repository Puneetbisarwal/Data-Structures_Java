import java.util.Scanner;
public class Selectsort {
	public static void Selsort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int m=i;
			for(int j=i+1;j<=arr.length;j++){
				if(arr[j]<arr[m]){
					m=j;
				}
			}
			int temp=arr[m];
			arr[m]=arr[i];
			arr[i]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();	
		}
		Selsort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
