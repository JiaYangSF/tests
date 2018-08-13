package test.jia.v2;

import test.jia.Runner;

public class QuickSort extends Runner{

	int[] arr;
	
	public int[] sort(int[] arr) {
		this.arr = arr;
		quickSort(0, arr.length-1);
		return arr;
	}
	
	private void quickSort(int from, int to) {
		if(from >= to) return;
		int counter = from; 
		int value = arr[to];
		for(int i=from ; i<to; i++) {
			if(arr[i]<value) {
				swap(arr, counter, i);
				counter++;
			}
		}
		swap(arr, to, counter);
		quickSort(from, counter-1);
		quickSort(counter+1, to);
		
	}
}
