package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * @author ghost
 *
 */
public class Solution {

	public int[] twoSum(int[] num, int target){
		
		//时间复杂度O(n^2)
		/*int[] sum = new int[2];
		for(int i = 0; i<num.length; i++){
			for(int j = i+1; j<num.length; j++){
				if(num[j] == target - num[i]){
					sum[0]=j;
					sum[1]=i;
					return sum;
				}
			}
			
		}
		return sum;*/
		
		//时间复杂度O(n)
		/**
		 * 在进行迭代并将元素插入到表中的同时，
		 * 我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。
		 * 如果它存在，那我们已经找到了对应解，并立即将其返回。
		 */
		Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < num.length; i++) {
	        int complement = target - num[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(num[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
