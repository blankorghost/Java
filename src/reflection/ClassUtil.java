package reflection;

import java.lang.reflect.Method;

/**
 * Class��Ļ���api
 * @author ghost
 *
 */
public class ClassUtil {

	/**
	 * ��ӡ�����Ϣ����Ա��������Ա����
	 */
	public static void printClassMessage(Object obj){
		//Ҫ��ȡ�����Ϣ������Ҫ��ȡ���������
		Class c = obj.getClass();  //���ݵ����ĸ�����Ķ���c���Ǹ������������
		//��ȡ�������
		System.out.println("������ƣ�"+c.getName());
		/**
		 * Method�࣬��������
		 * һ����Ա��������һ��method����
		 * getMethod()������ȡ�������е�public�ĺ�������������̳ж�����
		 */
		Method[] ms = c.getMethods();
		for(int i=0; i<ms.length; i++){
			//�õ������ķ���ֵ���͵�����
			Class returnType = ms[i].getReturnType();
			System.out.print("�����ķ���ֵ��"+returnType.getName()+" ");
			System.out.print("���������ƣ�"+ms[i].getName()+"(");
			//��ȡ��������
			Class[] paramType = ms[i].getParameterTypes();
			for(Class class1:paramType){
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
	

}
