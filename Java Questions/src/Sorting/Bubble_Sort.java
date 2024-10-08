package Sorting;

import java.util.Scanner;


//Worst Case Time Complexity: O(n*n)

//Best Case Time Complexity: O(n)

//Average Case Time Complexity: O(n*n)

//Space Complexity: O(1)


public class Bubble_Sort {

    static void bubbleSort(int arr[], int n)
    {
        int i,j;
        for(i=0;i<n-1;i++)
        {
            int flag=0;

            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=1;
                }
            }

            if(flag==0)
                break;
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

        System.out.println("\n---- Bubble Sorting ----\n\n ");
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

        bubbleSort(arr,n);

        printArray(arr,n);
    }

}
