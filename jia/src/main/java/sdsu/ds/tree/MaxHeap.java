package sdsu.ds.tree;

import test.jia.Runner;

public class MaxHeap<E> extends Runner<E> {
	int lastIndex;
	int size;
	E[] arr = (E[]) new Object[size];
	
	
	public void add(E object) {
		arr[++lastIndex]=object;
		trickleUp(lastIndex);
	}
	
	private void trickleUp(int index) {
		if(index == 0) return; // root
		// calculate parent
		int parent = (int) Math.floor((index-1)/2);
		if(((Comparable<E>)arr[index]).compareTo(arr[parent])>0) {
			swap(arr, index, parent);
			trickleUp(parent);
		}		
	}
	

	public void removeRoot() {
		E temp = arr[0];
		swap(arr, 0, lastIndex--);
		tricleDown(0);
	}

	private void tricleDown(int i) {
		
		
	}

}
