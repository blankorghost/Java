package objectandclass;
/**
* FileName: Demo1.java
* 类的详细说明
*
* @author lp
* @Date    2018.2.18
* @version 1.00
*/
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建和实例化对象
		Demo1 dogname = new Demo1();
		//调用dogName()打印小狗名字
		dogname.dogName("dog");
		
	}
	
	/**
	*
	* @param name ：小狗的名字
	* @return 无
	* @throws 无
	*/
	
	public void dogName(String name){
		System.out.println("小狗的名字："+name);
	}
}
