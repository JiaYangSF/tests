package test.jia;

import test.jia.v2.BuildHeapFromArray;
import test.jia.v3.QuickSort;

/**
 * Hello world!
 *
 */
public class Runner<E> {
	public static void main(String[] args) {
		// --------------- Generate Array ---------------\\
		int[] arr = generateRandomArray(10);
		
		
		// --------------- Merge Sort ---------------\\
		/*MergeSort merge = new MergeSort();
		merge.sort(arr);*/
		
		
		// --------------- Build the heap from array ---------------\\
		BuildHeapFromArray heap = new BuildHeapFromArray();
		heap.buildHeap(arr);
		
		// --------------- Quick Sort ---------------\\
		QuickSort sort = new QuickSort();
		sort.sort(arr);
		
		
		
		
		
		
		// --------------- Show array ---------------\\
		showArray(arr);
	}

	protected static void showArray(int[] list) {
		for (int t : list) {
			System.out.print(t + " ");
		}
		System.out.println();

	}

	protected static int[] generateRandomArray(int size) {
		int[] ar1 = new int[size];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = (int) (Math.random() * 100);
			System.out.print(ar1[i] + " ");
		}
		System.out.println();
		return ar1;

	}

	public void swap(E[] arr, int from, int to) {
		E temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}

	public void swap(int[] arr, int from, int to) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}

}
