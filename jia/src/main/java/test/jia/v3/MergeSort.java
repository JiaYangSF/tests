package test.jia.v3;

public class MergeSort {
	int[] arr;
	int[] temp;
	public void split(int[] arr) {
		this.arr = arr;
		temp=new int[arr.length];
		split(0, arr.length-1);
	}
	private void split(int low, int high) {
		if(low>= high) return;
		int mid = (low+high)/2;
		split(low, mid);
		split(mid+1, high);
		merge(low, mid, high);	
	}
	private void merge(int low, int mid, int high) {
		int i=low;
		int j=mid+1;
		int index=low;
		while(i<=mid && j<=high) {
			if(arr[i]<=arr[j]) {
				temp[index++]=arr[i++];
			}else {
				temp[index++]=arr[j++];
			}
		}
		while(i<=mid) temp[index++]=arr[i++];
		while(j<=high) temp[index++]=arr[j++];
		for ( index = low; index <= high; index++) {
			arr[index]=temp[index];
		}
		
	}

}
