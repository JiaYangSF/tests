package test.jia.v3;

public class TestMergeSort {
	public void test(int[] arr) {
		testSort(arr, 0, arr.length - 1, new int[arr.length]);
	}

	private void testSort(int[] arr, int from, int to, int[] temp) {
		if (from >= to)
			return;
		int middle = (from + to) / 2;
		testSort(arr, from, middle, temp);
		testSort(arr, middle + 1, to, temp);
		merge(arr, from, to, temp);
	}

	private void merge(int[] arr, int leftStart, int rightEnd, int[] temp) {
		int left = leftStart;
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
		int right = rightStart;
		int index = leftStart;
		int size = rightEnd-leftStart+1;

		while (right <= rightEnd && left <= leftEnd) {
			if (arr[left] < arr[right]) {
				temp[index++] = arr[left++];
			} else {
				temp[index++] = arr[right++];
			}
			while(left<=leftEnd) temp[index++] = arr[left++];
			while(right<=rightEnd) temp[index++] = arr[right++];
			for(index=leftStart; index<=rightEnd; index++) {
				arr[index]=temp[index];
			}

		}
	}
}
