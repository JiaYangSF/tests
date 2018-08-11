package test.jia;

import test.jia.v1.Merge;

/**
 * Hello world!
 *
 */
public class Runner<E> {
	public static void main(String[] args) {
		int[] arr = generateRandomArray(4);
//		Merge merge = new Merge();
//		merge.mergeSort(arr);
//		showArray(arr);
		Merge ms = new Merge();
		ms.sort(arr);
		showArray(arr);
	}

	private static void showArray(int[] list) {
		for (int t : list) {
			System.out.print(t + " ");
		}
		System.out.println();

	}

	private static int[] generateRandomArray(int size) {
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

}
