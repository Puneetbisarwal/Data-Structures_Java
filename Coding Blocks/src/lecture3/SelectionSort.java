package lecture3;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("------Selection Soting ---- ");
		System.out.print(" Enter The Size Of an Array =  ");
		int n=s.nextInt();
		int i,j,k,temp;
		int array[] =new int[n];;

		for( i=0;i<n;i++){
			System.out.print("Ënter "+ (i+1) +"th elements = ");
			array[i]=s.nextInt();
		}


		for( j=0;j<array.length;j++)
		{

			int min = array[j];
			int minIndex = j;
			for(k=j;k<array.length;k++){
				if(min>array[k])
				{
					min = array[k];
					minIndex = k;
				}
			}
			temp=array[minIndex];
			array[minIndex]=array[j];
			array[j]=temp;
		}

		for(int l=0;l<n;l++){
			System.out.println(array[l]);
		}
		
	}

}
