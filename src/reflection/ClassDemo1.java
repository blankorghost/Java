package reflection;

public class ClassDemo1 {
	
	public static void main(String[] args){
		//Food ʵ������
		Foo foo1 = new Foo();
		//�κ�һ���඼��Class��ʵ�����������ֱ�ʾ��ʽ
		//1.=>�κ�һ���඼��һ�������ľ�̬��Ա����class
		Class c1 = Foo.class;
		
		//2.��֪����Ķ���ͨ��getClass����
		Class c2 = foo1.getClass();
		
		/**
		 * ����c1��c2��ʾ��Foo���������
		 * ��������Զ���
		 * ��Ҳ�Ƕ�����Class���ʵ������
		 * ����������ǳ�Ϊ�����������
		 * */
		System.out.println(c1==c2);
		
		//3.
		Class c3 = null;
		try {
			c3 = Class.forName("reflection.Foo");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2==c3);
		
		//���ǿ���ͨ����������ʹ�������Ķ���ʵ��--->ͨ����c1 or c2 orc3����Foo��ʵ��
		try {
			Foo foo = (Foo)c1.newInstance();   //��Ҫ���޲����Ĺ��췽��       
			foo.print();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	}
	
}

class Foo{
	void print(){
		System.out.println("foo");
	}
}