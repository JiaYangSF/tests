package test.jia.lc.easy.sort;

import java.awt.List;
import java.nio.channels.ShutdownChannelGroupException;

import test.jia.Runner;

public class MergeTwoSortedArray extends Runner{
	/*
	 * Input: 
	 * nums1 = [1,2,3,0,0,0], m = 3 
	 * nums2 = [2,5,6], n = 3
	 * 
	 * Output: [1,2,2,3,5,6]
	 * 
	 * Merge nums2 into nums1 as one sorted array
	 */
	public static void main(String[] args) {
		int[] l2= {1,2,3,0,0,0};
		int[] l1= {2,5,6};
			showArray(merge(l1, l2));
		
		
		
	}

	
	private static int[] merge(int[] list1, int[] list2) {
		// assume list1 is bigger than list2
	
		if(list1[0] ==0 && list1[list1.length]==0) {
			return list2;
		}
			int index=list1.length-1;
			int right1=list1.length-list2.length-1;
			int right2=list2.length-1;

			while(right1>=0 && right2>=0) {
				if(list1[right1]>=list2[right2]) {
					list1[index]=list1[right1];
					right1--;
					index--;
				}else {
					list1[index]=list2[right2];
					right2--;
					index--;
				}
			}
		return list1;
		
		
	
	}

}
