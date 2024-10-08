package Searching;

import java.util.Scanner;

public class Linear_Search_Recursion {

    public static int Linear_Search_Recursion(int[] A, int start, int end, int search)
    {
        if(start>end)
            return -1;

        if(A[start] == search)
            return start;

        if(A[end]== search)
            return end;

        return Linear_Search_Recursion(A,start+1,end-1,search);

    }

    public static void main(String[] args) {

        int i;
        //int [] arr = new int[1000];

        System.out.println("\n---Recursive Linear Search---\n\n\n");
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



        int result = Linear_Search_Recursion(arr,0,n-1,x);

        if (result==-1)
        {
            System.out.println("The Number " +x +" is not found.");
        }
        else
            System.out.println("The Number "+x +" is found at index "+ (result+1));

    }

}
