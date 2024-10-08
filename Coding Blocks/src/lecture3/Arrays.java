package lecture3;

import java.util.Scanner;

public class Arrays {
	
	public static int linearSearch(int [] array,int element)
	{
		int i=0;
		while(i<array.length){
			if(array[i]==element){
				return i;
			}
			i++;
		}
		return -1;
	}
	
	
	
	
	
	
	public static int largest(int []array){
		int i=0;
		int largest =Integer.MIN_VALUE;
		while(i<array.length){
			if(array[i]>largest){
				largest=array[i];
			}
			i++;
		}
		return largest;
	}
	
	
	public static int sum(int []array)
	{
		int i=0;
		int sm=0;
		while(i<array.length){
				sm=sm+array[i];
			i++;
		}
		return sm;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Array Size = ");
		Scanner s=new Scanner(System.in);
		int size =s.nextInt();

		int array[]=new int[size];
		array[0]=10;
		
		
		increment(array);
		System.out.println(array[0]);
		
		
		int i=0;
		while(i<size){
			System.out.println("Ënter "+ (i+1) +"th elements");
			array[i]=s.nextInt();
			i++;
		}
		System.out.println("The Largest Number  of the Array is = "+largest(array));
		System.out.println("The Sum of the Array is = "+ sum(array));
		
		
		
		
		
		
//		
//		i=0;
//		int sum=0;
//		while(i<size){
//			sum=sum+array[i];
//			i++;
//
//		}
//		System.out.println(sum);

		//		int i;
		//		i=10;
		//		//boolean [] array=new  boolean[10];
		//		//array[0]=100;
		//		//array[5]=1000;
		//		//System.out.println(array[6]);
		//
		//		int array []=new int[10];
		//		int i1=0;
		//		while(i1<10){
		//			System.out.println(array[i1]);
		//			i1++;
		//		}
		//		
		//		
		//		System.out.println("Emter the Number = ");
		//		Scanner s=new Scanner(System.in);
		//		int n=s.nextInt();
	}
	
	public static void incrementNumber (int i){
		//arr=new int[10];
		i++;
		
	}
	public static void increment (int [] arr){
		//arr=new int[10];
		arr[0]++;
		
	}

}
