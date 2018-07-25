package algorithm;

public class Test {

	public static void main(String[] args) {
		/*int[] sum = new int[2];
		int[] num = {3,2,4};
		int target = 6;
		Solution st = new Solution();
		sum = st.twoSum(num, target);
		System.out.println(sum[0]+","+sum[1]);(3¡ú4¡ú2)+(4¡ú6¡ú5)=8¡ú0¡ú7*/
		/*ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
	    l1.val=3;
	    l1 = l1.next;
	    l1.val = 4;
	    l1 = l1.next;
	    l1.val = 2;
	    System.out.println(l1.val);*/
		
		String s = "cbb";
		OnlyStr  os = new OnlyStr();
		int i = os.lengthOfLongestSubstring(s);
		System.out.println(i);

	}

}
