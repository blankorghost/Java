package io;

import java.io.File;
import java.io.IOException;

/*
 * File��API��ʹ��
 */
public class FileDemo {

	public static void main(String[] args) {
		//�˽⹹�캯�������
		File file = new File("D://ѧϰ�ʼ�/java-io/imooc.txt");
		File file2 = new File("D://ѧϰ�ʼ�/java-io/imooc1");
		File file3 = new File("D://ѧϰ�ʼ�/java-io/imooc1.txt");
		File file4 = new File("D://ѧϰ�ʼ�/java-io","imooc2.txt");
		if(!file2.exists()){
			System.out.println("file2�ļ��в����ڣ����ڴ���...");
			file2.mkdirs();//�����ļ���,�༶Ŀ¼ʱ��mkdirs()
			System.out.println("file2�ļ��д����ɹ���");
		}else{
			file2.delete();
		}
		if(!file3.exists()){
			System.out.println("file3�ļ������ڣ����ڴ���...");
			try {
				file3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//�����ļ���
			System.out.println("file2�ļ������ɹ���");
		}else{
			file3.delete();
		}
		if(!file4.exists()){
			System.out.println("file4�ļ������ڣ����ڴ���...");
			try {
				file4.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//�����ļ���
			System.out.println("file4�ļ������ɹ���");
		}else{
			file4.delete();
		}
		System.out.println(file.exists());
		
		//����API
		System.out.println(file);//file.toString
		System.out.println(file.getName());
		System.out.println(file4.getName());
		System.out.println(file.getParent());

	}

}
