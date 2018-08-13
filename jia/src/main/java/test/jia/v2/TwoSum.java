package test.jia.v2;

import java.util.HashMap;
import java.util.Map;

/*Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

public class TwoSum {

	public int[] twoSum(int[] arr, int target){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			map.put(arr[i], i);
			
		}
		return null;
	}
}
