package sorft;
/**
 * ѡ������
 * @author ghost
 *
 */
public class SelectionSort {

	public void selectionSort(int[] array){
		int temp;
		for(int i=0; i<array.length; i++){
			// ��i���͵�j���Ƚ�j����ȡ�����һλ������Ҫ��j<=array.length-1
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[i] > array[j]) {   // ע���ð�����������������i��j�Ƚϡ�
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
			}
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
		
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(array);
	}

}
