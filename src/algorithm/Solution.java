package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
 * @author ghost
 *
 */
public class Solution {

	public int[] twoSum(int[] num, int target){
		
		//ʱ�临�Ӷ�O(n^2)
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
		
		//ʱ�临�Ӷ�O(n)
		/**
		 * �ڽ��е�������Ԫ�ز��뵽���е�ͬʱ��
		 * ���ǻ���ع�ͷ���������Ƿ��Ѿ����ڵ�ǰԪ������Ӧ��Ŀ��Ԫ�ء�
		 * ��������ڣ��������Ѿ��ҵ��˶�Ӧ�⣬���������䷵�ء�
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
