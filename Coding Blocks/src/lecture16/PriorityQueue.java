package lecture16;

import java.util.ArrayList;

public class PriorityQueue<T> {
	
	private ArrayList<HeapData<T>> data;
	
	public PriorityQueue() {
		data = new ArrayList<>();
		data.add(null);
	}
	
	public boolean isEmpty() {
		if (data.size() == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return data.size() - 1;
	}
	
	public void add(int priority, T value) {
		HeapData<T> newData = new HeapData<>();
		newData.priority = priority;
		newData.value = value;
		data.add(newData);
		
		int childIndex = data.size() - 1;
		int parentIndex = childIndex/2;
		while (childIndex != 1) {
			HeapData<T> child = data.get(childIndex);
			HeapData<T> parent = data.get(parentIndex);
			if (child.priority >= parent.priority) {
				break;
			} else {
				data.set(parentIndex, child);
				data.set(childIndex, parent);
				childIndex = parentIndex;
				parentIndex = childIndex/2;
			}
		}
		
	}
	
	public T min() throws HeapEmptyException {
		if (isEmpty()) {
			HeapEmptyException e = new HeapEmptyException();
			throw e;
		}
		return data.get(1).value;
	}
	
	public T removeMin() throws HeapEmptyException {
		if (isEmpty()) {
			HeapEmptyException e = new HeapEmptyException();
			throw e;
		}
		HeapData<T> output = data.get(1);
		data.set(1, data.get(data.size() - 1));
		data.remove(data.size() - 1);
		int parentIndex = 1;
		int leftChildIndex = 2*parentIndex;
		int rightChildIndex = leftChildIndex + 1;
		while (leftChildIndex < data.size()) {
			int minIndex = parentIndex;
			HeapData<T> leftChild = data.get(leftChildIndex);
			HeapData<T> parent = data.get(parentIndex);
			
			if (leftChild.priority < parent.priority) {
				minIndex = leftChildIndex;
			}
			
			if (rightChildIndex < data.size()) {
				HeapData<T> rightChild = data.get(rightChildIndex);
				if (rightChild.priority < data.get(minIndex).priority) {
					minIndex = rightChildIndex;
				}
			}
		
			if (minIndex == parentIndex) {
				break;
			} else {
				data.set(parentIndex, data.get(minIndex));
				data.set(minIndex, parent);
				parentIndex = minIndex;
				leftChildIndex = 2 * parentIndex;
				rightChildIndex = leftChildIndex + 1;
			}
		}
		return output.value;
	}
}
