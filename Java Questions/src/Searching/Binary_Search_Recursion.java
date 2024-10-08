package Searching;

import java.util.Scanner;

public class Binary_Search_Recursion {

    public static int Binary_Search_Recursion(int[] A, int left,int right, int search)
    {

        while (left<= right)
        {
            // int mid = (left+right)/2;
            int mid = left + (right-left)/2;

            if (search == A[mid])
                return mid;

            if(search < A[mid])
                right = Binary_Search_Recursion(A,left,mid-1,search);

            else
                left = Binary_Search_Recursion(A,mid+1,right,search);;

        }
        return -1;
    }


    public static void main(String[] args) {
        int i;
        //int [] arr = new int[1000];

        System.out.println("\n---Recursive Binary Search---\n\n\n");
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


        int result = Binary_Search_Recursion(arr,0,n-1,x);

        if (result==-1)
        {
            System.out.println("The Number " +x +" is not found.");
        }
        else
            System.out.println("The Number "+x +" is found at index "+ (result+1));
    }
}
