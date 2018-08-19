package test.jia.v3;

import test.jia.Runner;

public class QuickSort extends Runner{
	public void sort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}

	private void sort(int[] arr, int from, int to) {
		if(arr == null) return;
		if(from >= to) return;
		int counter = from;
		int value = arr[to];
		for(int i=from; i<to; i++) {
			if(arr[i]<value) {
				swap(arr, counter, i);
				counter++;
			}
		}
		swap(arr, to, counter);
		sort(arr, from, counter-1);
		sort(arr, counter+1, to);
		
	}
}
