package objectandclass;
/**
* FileName: Demo1.java
* �����ϸ˵��
*
* @author lp
* @Date    2018.2.18
* @version 1.00
*/
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ʵ��������
		Demo1 dogname = new Demo1();
		//����dogName()��ӡС������
		dogname.dogName("dog");
		
	}
	
	/**
	*
	* @param name ��С��������
	* @return ��
	* @throws ��
	*/
	
	public void dogName(String name){
		System.out.println("С�������֣�"+name);
	}
}
