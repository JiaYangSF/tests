package test.jia.v2;

import test.jia.Runner;

public class BuildHeapFromArray extends Runner{
	public void buildHeap(int[] arr) {
		int n=arr.length;
		for(int i=n/2-1; i>=0; i--) {
			heapify(arr, n, i);
		}
	}

	private void heapify(int[] arr, int n, int i) {
		int largest = i;
		int l = i*2+1;
		int r = i*2+2;
		
		if(l<n && arr[l]>arr[largest]) {
			largest = l;
		}
		
		if(r<n && arr[r]>arr[largest]) {
			largest = r;
		}
		
		if(largest != i) {
			swap(arr, largest, i);
			heapify(arr, n, largest);
		}
		
	}

}
