package sorft;
/**
 * ϣ������
 * @author ghost
 *
 */
public class ShellSort {
	public void shellSort(int[] array, int n) {
        int i, j, gap, num=0;
        int temp;
        for (gap = n / 2,num=0; gap > 0; gap /= 2,num++) {// ����gap��С
            for (i = gap; i < n; i++) {// �����ݽ��з���
                for (j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap) {// ��ÿ�����ݽ��в�������
                    temp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = temp;
                }
                // ��ӡÿ��������
                System.out.print("��"+(num+1)+"��������");
                for (int m = 0; m <= array.length - 1; m++) {
                    System.out.print(array[m] + "\t");
                }
                System.out.println();
            }
        }
    }
  
    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int[] array = { 5, 69, 12, 3, 56, 789, 2, 5648, 23 };
        shellSort.shellSort(array, array.length);// ע��Ϊ����ĸ���
        for (int m = 0; m <= array.length - 1; m++) {
            System.out.print(array[m] + "\t");
        }
    }
}
