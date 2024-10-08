package Searching;

import java.util.Scanner;


//Worst Case Time Complexity: O(logn)

//Best Case Time Complexity: O(logn)

//Average Case Time Complexity: O(logn)

//Space Complexity: O(1)

public class Binary_Search {


    //public static int Binary_Search(int[] A, int number, int search)
    public static int Binary_Search(int[] A, int search)
    {
        int left=0,right = A.length-1;

        while (left<= right)
        {
            // int mid = (left+right)/2;
            int mid = left + (right-left)/2;

            if (search == A[mid])
                return mid;

            if(search < A[mid])
                right = mid-1;

            else
                left = mid+1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int i;
        //int [] arr = new int[1000];

        System.out.println("\n---Binary Search---\n\n\n");
        System.out.print("Enter the Number of Elements = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " +n +" elements");
        for (i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Number to be Searched = ");
        int x = sc.nextInt();


        //int result = Binary_Search(arr,n,x);
        int result = Binary_Search(arr,x);

        if (result==-1)
        {
            System.out.println("The Number " +x +" is not found.");
        }
        else
            System.out.println("The Number "+x +" is found at index "+ (result+1));
    }
}
