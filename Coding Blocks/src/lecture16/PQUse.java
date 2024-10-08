package lecture16;



public class PQUse {

	public static void addToHeap(int a[], int index) {
		
	}
	
	public static int removeMin(int a[], int lastIndex) {
	return 0;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int a[] = {1000, 10,5,6,2,11,23,7,1};
		
		for (int i = 1; i < a.length; i++) {
			addToHeap(a, i);
		}
		for (int i = a.length - 1; i >=1; i--) {
			a[i] = removeMin(a, i);
		}
		
		
		for (int i: a) {
			pq.add(i, i);
		}
		
		while (!pq.isEmpty()) {
			try {
				System.out.println(pq.removeMin());
			} catch (HeapEmptyException e) {
				System.out.println("Shouldnt come here");
				return;
			}
		}
		
	}

}
