package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 * @author ghost
 *
 */
public class HuiwenString {

	public String longestPalindrome(String s) {
		String[] arr = s.split("");
		String arra = "";
		String arrb = "";
		String result="";
		int n=0,m=0;
		for(int i=0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				arra +=arr[i]+arr[j];
				arrb +=arr[j]+arr[i];
				arr[i] += arr[j];
				if(arra.equals(arrb)){
					n=i;
					m=j;
					break;
				}
			}
		}
		for(int k=n; k<m; k++){
			result +=arr[k];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HuiwenString huiwenString = new HuiwenString();
		String ss= "babad";
		System.out.println(huiwenString.longestPalindrome(ss));
	}

}
