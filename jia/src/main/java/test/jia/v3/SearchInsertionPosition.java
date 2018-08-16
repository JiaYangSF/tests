package test.jia.v3;

public class SearchInsertionPosition {
	// 5 conner cases
	
	public int split(int[] arr, int target) {
		return split(arr, 0, arr.length-1, target);
	}

	private int split(int[] arr, int from, int to, int target) {
		if(from >= to) return from;
		int middle = (from + to)/2;
		if(target<= arr[middle]) {
			split(arr, from, middle, target);
		}else {
			split(arr, middle+1, to, target);
		}
		
		return getIndex(arr, from , to, target);
		
	}

	private int getIndex(int[] arr, int from, int to, int target) {
		while(from <= to) {
			if(arr[from] == target) {
				return from;
			}else {
				from ++;
			}
		}
		return from;
	}

}
