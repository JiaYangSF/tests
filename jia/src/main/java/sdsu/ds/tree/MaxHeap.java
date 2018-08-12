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
	

	public E removeRoot() {
		E temp = arr[0];
		swap(arr, 0, lastIndex--);
		tricleDown(0);
		return temp;
	}

	private void tricleDown(int parent) {
		int left = 2*parent+1;
		int right = 2*parent +2;
		// swap with parent if left or right is bigger than parent
		if(left == lastIndex && ((Comparable<E>)arr[parent]).compareTo(arr[left]) < 0) {
			swap(arr, parent, left);
			return;
		}
		
		if(right == lastIndex && ((Comparable<E>) arr[parent]).compareTo(arr[right])<0){
			swap(arr, parent, right);
			return;
		}
		
		// if left index or right index is bigger than last index, which means it's out of the tree
		if(left >= lastIndex || right >=lastIndex) {
			return;
		}
		
		// compare the left and right to pick which one to swap with
		if(((Comparable<E>)arr[left]).compareTo(arr[right]) >0 && ((Comparable<E>)arr[left]).compareTo(arr[parent]) >0 ) {
			swap(arr, left, parent);
			tricleDown(left);
			return;
		}else if (((Comparable<E>)arr[right]).compareTo(arr[left]) >0 && ((Comparable<E>)arr[right]).compareTo(arr[parent]) >0 ){
			swap(arr, right, parent);
			tricleDown(right);
			return;
		}
		
		
		
	}

}
