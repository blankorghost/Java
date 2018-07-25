package sorft;
/**
 * 选择排序
 * @author ghost
 *
 */
public class SelectionSort {

	public void selectionSort(int[] array){
		int temp;
		for(int i=0; i<array.length; i++){
			// 第i个和第j个比较j可以取到最后一位，所以要用j<=array.length-1
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[i] > array[j]) {   // 注意和冒泡排序的区别，这里是i和j比较。
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
			}
			// 打印每趟排序结果
			System.out.print("第"+(i+1)+"次排序结果");
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
