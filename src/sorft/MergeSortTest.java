package sorft;
/**
 * �鲢����
 * @author ghost
 *
 */
public class MergeSortTest {
	public void sort(int[] array, int left, int right) {
        if (left >= right)
            return;
        // �ҳ��м�����
        int center = (left + right) / 2;
        // �����������еݹ�
        sort(array, left, center);
        // ���ұ�������еݹ�
        sort(array, center + 1, right);
        // �ϲ�
        merge(array, left, center, right);
        // ��ӡÿ��������
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
  
    }
  
    /**
     * ������������й鲢���鲢ǰ��2�����������򣬹鲢����Ȼ����
     * 
     * @param array
     *            �������
     * @param left
     *            ������ĵ�һ��Ԫ�ص�����
     * @param center
     *            ����������һ��Ԫ�ص�������center+1���������һ��Ԫ�ص�����
     * @param right
     *            ���������һ��Ԫ�ص�����
     */
    public void merge(int[] array, int left, int center, int right) {
        // ��ʱ����
        int[] tmpArr = new int[array.length];
        // �������һ��Ԫ������
        int mid = center + 1;
        // third ��¼��ʱ���������
        int third = left;
        // �����������һ��Ԫ�ص�����
        int tmp = left;
        while (left <= center && mid <= right) {
            // ������������ȡ����С�ķ�����ʱ����
            if (array[left] <= array[mid]) {
                tmpArr[third++] = array[left++];
            } else {
                tmpArr[third++] = array[mid++];
            }
        }
        // ʣ�ಿ�����η�����ʱ���飨ʵ��������whileֻ��ִ������һ����
        while (mid <= right) {
            tmpArr[third++] = array[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = array[left++];
        }
        // ����ʱ�����е����ݿ�����ԭ������
        // ��ԭleft-right��Χ�����ݱ����ƻ�ԭ���飩
        while (tmp <= right) {
            array[tmp] = tmpArr[tmp++];
        }
    }
  
    public static void main(String[] args) {
        int[] array = new int[] { 5, 69, 12, 3, 56, 789, 2, 5648, 23 };
        MergeSortTest mergeSortTest = new MergeSortTest();
        mergeSortTest.sort(array, 0, array.length - 1);
        System.out.println("���������飺");
        for (int m = 0; m <= array.length - 1; m++) {
            System.out.print(array[m] + "\t");
        }
    }
}
