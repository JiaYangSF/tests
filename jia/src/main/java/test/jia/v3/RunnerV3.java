package test.jia.v3;

import test.jia.Runner;

public class RunnerV3 extends Runner{

	public static void main(String[] args) {
/*		int[] arr = {1,3,5,6};
		Arrays.sort(arr);
		showArray(arr);
		
		SearchInsertionPosition seach=new SearchInsertionPosition();
		System.out.println(seach.split(arr, 2));*/
		
		int[] arr = generateRandomArray(10);
		MergeSort quick=new MergeSort();
		quick.split(arr);
		showArray(arr);
		
		

	}

}
