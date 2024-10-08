package Sorting;
import java.util.Scanner;


//Worst Case Time Complexity: O(n*n)

//Best Case Time Complexity: O(nlogn)

//Average Case Time Complexity: O(nlogn)

// Space Complexity: O(nlogn)




public class Quick_Sort {


    static void quickSort(int arr[], int start, int end)
    {
        int location;
        if(start<end)
        {
            location=PartitionQuick(arr,start,end);
            quickSort(arr,start,location-1);
            quickSort(arr,location+1,end);
        }
    }


    static int PartitionQuick(int arr[], int lb, int ub)
    {
        int i,j,pivot,start,end;
        pivot=arr[lb];
        start = lb;
        end = ub;

        System.out.println("Lower Bound = "+lb);
        System.out.println("Upper Bound = "+ub);
        System.out.println("Start = "+start);
        System.out.println("End = "+end);


        while (start<end)
        {
            while(arr[start]<=pivot && start<=ub-1)
            {
                start++;
            }
            while(arr[end]>pivot && end>=lb+1)
            {
                end--;
            }
            if(start<end)
            {
                //swap(arr[start],arr[end]);
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        //swap(arr[lb],arr[end]);
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;

        return end;

    }


    static void printArray(int array[],int size)
    {
        int i;
        System.out.println("Sorted list in Ascending order : ");

        for(i=0;i<size;i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {

        System.out.println("\n---- Quick Sorting ----\n\n\n ");
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

        quickSort(arr,0,n-1);

        printArray(arr,n);

    }
}
