package lecture8;

public class QuickSort {

	public static void Quick(int[] input,int beginIndex,int endIndex) {
		if(beginIndex>=endIndex) {
			return  ;
		}
		int pivotPos =partition(input,beginIndex,endIndex);
		Quick(input, beginIndex, pivotPos-1);
		Quick(input, pivotPos+1, endIndex);
	}

	public static int partition (int [] input,int beginIndex,int endIndex) {

		int pivot =input[beginIndex];
		int pivotPos=beginIndex;

		for(int i=beginIndex;i<=endIndex;i++) {
			if(pivot>input[i])
			{
				pivotPos++;
			}
		}

		input[beginIndex]=input[pivotPos];
		input[pivotPos]=pivot;
		int i=beginIndex;
		int j=endIndex;

		while(i<pivotPos && j>pivotPos) {
			if(input[i]<pivot) {
				i++;
			}
			else if (input[j]>pivot) {
				j--;
			}
			else {
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j--;
			}
		}

		return pivotPos;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []input ={5,5,4,6,8,1,4,13,0};
		Quick(input,0,input.length-1);
		for (int i=0;i<input.length;i++)
		{
			System.out.println("Sorted Array is = "+ input[i]);
		}

	}
}