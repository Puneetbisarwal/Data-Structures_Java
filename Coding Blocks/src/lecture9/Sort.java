package lecture9;

public class Sort<T>{

//	public  <T extends CompareInterface<T>> void bubblesort (T input[]) {
	public static <T extends CompareInterface<T>> void bubblesort (T input[]) { 

		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length-i-1;j++)
			{
				if(input[j].compareTo(input[j+1])==1) {
					T temp =input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
							
				}
			
			}
		}
	}

	}
