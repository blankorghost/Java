package reflection;

import java.lang.reflect.Method;

/**
 * Class类的基本api
 * @author ghost
 *
 */
public class ClassUtil {

	/**
	 * 打印类的信息，成员函数，成员变量
	 */
	public static void printClassMessage(Object obj){
		//要获取类的信息，首先要获取类的类类型
		Class c = obj.getClass();  //传递的是哪个子类的对象，c就是该子类的类类型
		//获取类的名称
		System.out.println("类的名称："+c.getName());
		/**
		 * Method类，方法对象
		 * 一个成员方法就是一个method对象
		 * getMethod()方法获取的是所有的public的函数，包括父类继承而来的
		 */
		Method[] ms = c.getMethods();
		for(int i=0; i<ms.length; i++){
			//得到方法的返回值类型的类型
			Class returnType = ms[i].getReturnType();
			System.out.print("方法的返回值："+returnType.getName()+" ");
			System.out.print("方法的名称："+ms[i].getName()+"(");
			//获取参数类型
			Class[] paramType = ms[i].getParameterTypes();
			for(Class class1:paramType){
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
	

}
