package test.jia.v3;

import test.jia.Runner;

public class TestQuickSort extends Runner{
	int[] arr;
	public void sort(int[] arr) {
		this.arr = arr;
		quickSort(0, arr.length-1);
	}

	private void quickSort(int from, int to) {
		if(from >= to) return;
		int counter=from;
		int value = arr[to];
		for(int i=from; i<to; i++) {
			if(arr[i]<value) {
				swap(arr, counter, i);
				counter++;
			}
		}
		swap(arr, counter, to);
		quickSort(from, counter-1);
		quickSort(counter+1, to);
	}

}
