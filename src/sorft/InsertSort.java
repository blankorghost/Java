package sorft;
/**
 * ��������
 * @author ghost
 *
 */
public class InsertSort {

	public void insertSort(int[] array,int first, int last){
		int temp, i, j;
		for(i = first+1; i<=last-1; i++){// Ĭ���Ե�һ����Ϊ�������У��������ΪҪ���������
			temp = array[i];
			j = i - 1;
			// �Ӻ���������������������С��temp��������Ƽ���������
			//ֱ��������С�ڻ����temp��������
			while(j >= first && array[j] > temp){
				array[j+1] = array[j];
				j--;
			}
			array[j + 1] = temp;
	        // ��ӡÿ��������
			System.out.print("��"+(i+1)+"��������");
	        for (int m = 0; m <= array.length - 1; m++) {
	        	System.out.print(array[m] + "\t");
	        	}
	        System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,8,6,9,5,2,74,85};
		
		InsertSort insertSort = new InsertSort();
		insertSort.insertSort(array,0,array.length);
	}

}
