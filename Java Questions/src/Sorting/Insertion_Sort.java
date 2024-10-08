package Sorting;
import java.util.Scanner;



//Worst Case Time Complexity: O(n*n)

//Best Case Time Complexity: O(n)

//Average Case Time Complexity: O(n*n)

//Space Complexity: O(1)


public class Insertion_Sort {
    public static void insertionSort (int arr[], int size)
    {
        //int n = arr.length;
        int i,j,temp;

        for( j=1;j<size;j++)
        {
             temp=arr[j];
             i = j-1;

            while(i>=0 && arr[i]>temp)
            {
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=temp;
        }
    }

    static void printSort(int arr[],int size)
    {
        //int n = arr.length;
        int i;
        System.out.println("Sorted list in Ascending order :");
        for( i=0;i<size;i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("\n---- Insertion Sorting ----\n\n\n ");
        int i;

        System.out.print("Enter the Number of Elements = ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n +" elements");
        for (i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr,n);

        printSort(arr,n);

    }
}
