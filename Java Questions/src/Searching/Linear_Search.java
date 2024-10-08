package Searching;

import java.util.Scanner;

//Worst Case Time Complexity: O(n)

//Best Case Time Complexity: O(1)

//Average Case Time Complexity: O(n)

//Space Complexity: O(1)


public class Linear_Search {

    public static int Linear_Search(int[] A, int number, int search)
    {
        for (int i=0;i<number;i++)
        {
            if(A[i]==search)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int i;
        //int [] arr = new int[1000];

        System.out.println("\n---Linear Search---\n\n\n");
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

        /*
        int flag=0;
        for (i=0;i<n;i++)
        {
            if(x==arr[i])
            {
                flag=1;
                break;
            }
        }

        if(flag==1)
            System.out.println("The Number "+x +" is found at index "+ (i+1));
        else
            System.out.println("The Number " +x +" is not found.");

        */


        int result = Linear_Search(arr,n,x);

        if (result==-1)
        {
            System.out.println("The Number " +x +" is not found.");
        }
        else
            System.out.println("The Number "+x +" is found at index "+ (result+1));
    }
}




