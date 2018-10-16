package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmonsSubSequence {

	
	/*We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.

	Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.

	Example 1:
	Input: [1,3,2,2,5,2,3,7]
	Output: 5
	Explanation: The longest harmonious subsequence is [3,2,2,2,3].*/
	
	public static void main(String[] args) {

		
		
		
	}

	
	

    public int findLHS(int[] nums) {
        
      int rst = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                rst = Math.max(rst, map.get(key) + map.get(key + 1));
            }
        }
        return rst;
        
    }

	
}
