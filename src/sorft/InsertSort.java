package sorft;
/**
 * 插入排序
 * @author ghost
 *
 */
public class InsertSort {

	public void insertSort(int[] array,int first, int last){
		int temp, i, j;
		for(i = first+1; i<=last-1; i++){// 默认以第一个数为有序序列，后面的数为要插入的数。
			temp = array[i];
			j = i - 1;
			// 从后进行搜索如果搜索到的数小于temp则该数后移继续搜索，
			//直到搜索到小于或等于temp的数即可
			while(j >= first && array[j] > temp){
				array[j+1] = array[j];
				j--;
			}
			array[j + 1] = temp;
	        // 打印每次排序结果
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
		
		InsertSort insertSort = new InsertSort();
		insertSort.insertSort(array,0,array.length);
	}

}
