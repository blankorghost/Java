package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * ����һ���ַ������ҳ��������ظ��ַ�����Ӵ��ĳ��ȡ�
 * ���� "abcabcbb" ��û���ظ��ַ�����Ӵ��� "abc" ����ô���Ⱦ���3��
 * ���� "bbbbb" ������Ӵ����� "b" ��������1��
 * ���� "pwwkew" ����Ӵ��� "wke" ��������3��
 * ��ע��𰸱�����һ���Ӵ���"pwke" �� ������  �������Ӵ���
 * @author ghost
 *
 */
public class OnlyStr {
	/**
	 * ����һ
	 * @param s
	 * @return
	 */
	/*public int lengthOfLongestSubstring(String s) {
		int size=0;
        int start =0;
        int pos;
        String str="";
        for(int i =0;i<s.length();i++){
        	if(str.indexOf(s.charAt(i))!=-1){
        		if(str.length()>size){
        			size=str.length();
        		}
        		 pos = str.indexOf(s.charAt(i));
        		 str = s.substring(start + str.indexOf(s.charAt(i))+1, i+1);
                 start = start + pos + 1; //start ��¼��ȡ�ַ�����ͷ��ԭ�ַ�����λ��
        	}
        	else{
        		str =str+s.charAt(i);
        		if(str.length()>size){
        			size=str.length();
        		}
        	}	
        }
        return size;
    }*/

    
    //����2��������
    /**
     * �㷨�������ǳ��򵥡�����̫���ˡ���ô���Ǹ�����Ż����أ�
     * �ڱ������У����ǻᷴ�����һ�����ַ����Ƿ������ظ����ַ���
     * ������û�б�Ҫ�ġ���������� i�� j-1֮������ַ��� sij
     * �Ѿ������Ϊû���ظ��ַ�������ֻ��Ҫ��� s[j]��Ӧ���ַ��Ƿ��Ѿ�������
     * ���ַ��� sij�С�Ҫ���һ���ַ��Ƿ��Ѿ������ַ����У�
     * ���ǿ��Լ���������ַ������⽫����һ�����Ӷ�Ϊ O(n^2) ���㷨��
     * �����ǿ������ø��á�ͨ��ʹ�� HashSet ��Ϊ�������ڣ����ǿ����� O(1)
     * ��ʱ������ɶ��ַ��Ƿ��ڵ�ǰ�����ַ����еļ�顣
     * ��������������/�ַ��������г��õĳ����� 
     * ����ͨ����������/�ַ������ɿ�ʼ�ͽ������������һϵ��Ԫ�صļ��ϣ�
     * �� [i, j)����գ��ҿ����������������ǿ��Խ������߽���ĳһ���򡰻������Ĵ��ڡ�
     * ���磬���ǽ� [i, j)���һ��� 1��Ԫ�أ���������Ϊ [i+1, j+1)����գ��ҿ�����
     * �ص����ǵ����⣬����ʹ�� HashSet ���ַ��洢�ڵ�ǰ���� [i, j)����� j = ij=i���С� 
     * Ȼ���������Ҳ໬������ j����������� HashSet �У����ǻ�������� j��
     * ֱ�� s[j] �Ѿ������� HashSet �С���ʱ�������ҵ���û���ظ��ַ�������ַ���
     * ���������� i��ͷ��������Ƕ����е� i���������Ϳ��Եõ��𰸡�
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
