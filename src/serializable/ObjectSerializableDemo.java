package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 对象序列化
 */
public class ObjectSerializableDemo {

	public static void main(String[] args) throws IOException, IOException {
		String file = "demo/obj.dat";
		// 1.对象序列化
		/*ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file));
		Student stu = new Student("1000001","张三",20);
		oos.writeObject(stu);
		oos.flush();
		oos.close();*/
		//2.对象反序列化
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file));
		try {
			Student stu = (Student)ois.readObject();
			System.out.println(stu);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ois.close();
	}

}
