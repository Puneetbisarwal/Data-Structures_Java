import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();	
		
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j<=arr.length;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
