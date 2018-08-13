package test.jia.v2;

public class MergeSort {
	
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length-1, new int[arr.length]);
	}

	private void mergeSort(int[] arr, int left, int right, int[] temp) {
		if(left>=right) return;
		int middle = (left+right)/2;
		mergeSort(arr, left, middle, temp);
		mergeSort(arr, middle+1, right, temp);
		merge(arr, left, right, temp);
		
	}

	private void merge(int[] arr, int leftStart, int rightend, int[] temp) {
		int left = leftStart; 
		int leftEnd = (leftStart+rightend)/2;
		int rightStart = leftEnd+1;
		int right = rightStart;
		int index=leftStart;
		int size = rightend-leftStart+1;
		
		while(left<=leftEnd && right<= rightend) {
			if(arr[left]<=arr[right]) {
				temp[index]=arr[left];
				left ++;
			}else {
				temp[index]=arr[right];
				right++;
			}
			index ++;
			
		}
	
		System.arraycopy(arr, left, temp, index, leftEnd-left+1);
		System.arraycopy(arr, right, temp, index, rightend - right+1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
	}

}
