import java.util.Scanner;
public class Bubble_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();	
		
		}
		for(int j=0;j<arr.length;j++){
		for(int i=0;i<arr.length-1-j;i++){
		if(arr[i]>arr[i+1]){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		}
		}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]);
			System.out.print(" ");
	
		
		}
		
	}

}
