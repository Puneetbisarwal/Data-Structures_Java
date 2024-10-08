package Sorting;

import java.util.Scanner;


//Worst Case Time Complexity: O(n*n)

//Best Case Time Complexity: O(n*n)

//Average Case Time Complexity: O(n*n)

//Space Complexity: O(1)



public class Selection_Sort {

    static void selectionSort(int arr[], int n)
    {
        int i,j,iMin,temp;
        for(i=0;i<n;i++)
        {
            iMin=i;

            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[iMin])
                    iMin=j;
            }

            temp=arr[i];
            arr[i]=arr[iMin];
            arr[iMin]=temp;
        }
    }

    static void printArray(int array[],int size)
    {
        int i;
        System.out.println("Sorted list in Ascending order : ");

        for(i=0;i<size;i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {

        System.out.println("\n---- Selection Sorting ----\n\n ");
        int i,j,temp;

        System.out.print("Enter the Number of Elements = ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n +" elements");
        for (i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr,n);

        printArray(arr,n);
    }

}
