package Sorting;
import java.util.Scanner;

//Best Case Time Complexity: O(nlogn)

//Average Case Time Complexity: O(nlogn)

//Space Complexity: O(n)


public class Merge_Sort {


    public static void Merge(int Array[],int start,int middle,int end)
    {
        int i,j,k;

        int n1 = middle-start+1;
        int n2 = end-middle;

        int L[] = new int[n1];
        int R[] = new int[n2];


        for( i=0;i<n1;i++)
            L[i] = Array[start+i];

        for( j=0;j<n2;j++)
            R[j] = Array[middle+1+j];


        i=0;
        j=0;
        k=start;

        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                Array[k]=L[i];
                i++;
            }
            else
            {
                Array[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            Array[k]=L[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            Array[k]=R[j];
            j++;
            k++;
        }
    }


    public static void mergeSort(int A[], int lb, int ub)
    {
        if (lb<ub)
        {
            int mid =lb+(ub-lb)/2;
            mergeSort(A,lb,mid);
            mergeSort(A,mid+1,ub);
            Merge(A,lb,mid,ub);
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

        System.out.println("\n---- Merge Sorting ----\n\n ");
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

        mergeSort(arr,0,n-1);

        printArray(arr,n);
    }
}
