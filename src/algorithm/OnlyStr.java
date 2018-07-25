package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。
 * 请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 * @author ghost
 *
 */
public class OnlyStr {
	/**
	 * 方法一
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
                 start = start + pos + 1; //start 记录截取字符串开头在原字符串的位置
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

    
    //方法2滑动窗口
    /**
     * 算法暴力法非常简单。但它太慢了。那么我们该如何优化它呢？
     * 在暴力法中，我们会反复检查一个子字符串是否含有有重复的字符，
     * 但这是没有必要的。如果从索引 i到 j-1之间的子字符串 sij
     * 已经被检查为没有重复字符。我们只需要检查 s[j]对应的字符是否已经存在于
     * 子字符串 sij中。要检查一个字符是否已经在子字符串中，
     * 我们可以检查整个子字符串，这将产生一个复杂度为 O(n^2) 的算法，
     * 但我们可以做得更好。通过使用 HashSet 作为滑动窗口，我们可以用 O(1)
     * 的时间来完成对字符是否在当前的子字符串中的检查。
     * 滑动窗口是数组/字符串问题中常用的抽象概念。 
     * 窗口通常是在数组/字符串中由开始和结束索引定义的一系列元素的集合，
     * 即 [i, j)（左闭，右开）。而滑动窗口是可以将两个边界向某一方向“滑动”的窗口。
     * 例如，我们将 [i, j)向右滑动 1个元素，则它将变为 [i+1, j+1)（左闭，右开）。
     * 回到我们的问题，我们使用 HashSet 将字符存储在当前窗口 [i, j)（最初 j = ij=i）中。 
     * 然后我们向右侧滑动索引 j，如果它不在 HashSet 中，我们会继续滑动 j。
     * 直到 s[j] 已经存在于 HashSet 中。此时，我们找到的没有重复字符的最长子字符串
     * 将会以索引 i开头。如果我们对所有的 i这样做，就可以得到答案。
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
