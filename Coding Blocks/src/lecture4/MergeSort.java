package lecture4;

public class MergeSort {

	public static void merge(int [] firstHalf,int [] secondHalf,int[] input) {
		
	}
	
	public static void mergeSort(int []input) {
	//base case
	int mid =input.length/2;
	int[] firstHalf =new int[mid];
	int[] secondHalf =new int[input.length-mid];
	//copy data  to firstHalf 
	//copy data  to secondHalf;
	mergeSort(firstHalf);
	mergeSort(secondHalf);
	merge(firstHalf,secondHalf,input);
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}








































//void mergesort(int a[],int p,int r);
//void merge(int a[],int p,int q,int r);
//
//void main()
//{
// int a[20],i,j,n,p,q,r;
// printf("\n\n\n----MERGE SORTING---\n\n\n");
// printf("Enter the Number of Elements  = ");
// scanf("%d",&n);
// for(i=1;i<=n;i++)
// {
// printf("Enter the %d element = ",i);
// scanf("%d",&a[i]);
// }
// p=1;
// r=n;
// mergesort(a,p,r);
// printf("Sorted array\n");
// for(i=1;i<=n;i++)
// printf("%d\n",a[i]);
// getch();
//}
//
//void mergesort(int a[],int p,int r)
//{
// if(p<r)
//   {
//    int q=floor((p+r)/2);
//    mergesort(a,p,q);
//    mergesort(a,q+1,r);
//    merge(a,p,q,r);
//   }
//}
//
//void merge(int a[],int p,int q,int r)
//{
// int n1=q-p+1;  int n2=r-q;
// int l[20],rt[20],i,j,k;
// for(i=1;i<=n1;i++)
//    { l[i]=a[p+i-1];
//    }
// for(j=1;j<=n2;j++)
//    {
//     rt[j]=a[q+j];
//    }
// l[n1+1]=1000;
// rt[n2+1]=1000;
// i=1;
// j=1;
//
//
// for(k=p;k<=r;k++)
//   {
//    if(l[i]<=rt[j])
//       {
//	a[k]=l[i];
//	 i++;
//       }
//    else
//       {
//	a[k]=rt[j];
//    j++;
//       }
//   }
//}
