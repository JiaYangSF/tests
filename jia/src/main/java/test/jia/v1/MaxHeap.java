package test.jia.v1;

import test.jia.Runner;

public class MaxHeap extends Runner {
	int lastIndex;
	int size;
	int[] arr = new int[size];
	
	
	public void add(int data) {
		arr[++lastIndex]=data;
		trickleUp(lastIndex);
	}
	
	private void trickleUp(int index) {
		if(index == 0) return; // root
		// calculate parent
		int parent = (int) Math.floor((index-1)/2);
		if(arr[index]>arr[parent]) {
			swap(arr, index, parent);
			trickleUp(parent);
		}		
	}
	

	public int removeRoot() {
		int temp = arr[0];
		swap(arr, 0, lastIndex--);
		tricleDown(0);
		return temp;
	}

	private void tricleDown(int parent) {
		int left = 2*parent+1;
		int right = 2*parent +2;
		// swap with parent if left or right is bigger than parent
		if(left == lastIndex && arr[parent]< arr[left]) {
			swap(arr, parent, left);
			return;
		}
		
		if(right == lastIndex && arr[parent]< arr[right]){
			swap(arr, parent, right);
			return;
		}
		
		// if left index or right index is bigger than last index, which means it's out of the tree
		if(left >= lastIndex || right >=lastIndex) {
			return;
		}
		
		// compare the left and right to pick which one to swap with
		if(arr[left]> arr[right] && arr[left]> arr[parent] ) {
			swap(arr, left, parent);
			tricleDown(left);
			return;
		}else if (arr[right]> arr[left]  && arr[right]> arr[parent] ){
			swap(arr, right, parent);
			tricleDown(right);
			return;
		}
		
		
		
	}

}
