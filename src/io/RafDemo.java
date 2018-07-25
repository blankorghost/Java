package io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/*
 * RandomAccessFile�����ļ�
 */
public class RafDemo {

	public static void main(String[] args) throws IOException{
		File demo = new File("demo");
		if(!demo.exists()){
			demo.mkdir();
		}
		File file = new File(demo,"raf.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		//ָ���λ��
		System.out.println(raf.getFilePointer());
		
		raf.write('A');
		System.out.println(raf.getFilePointer());
		raf.write('B');
		
		int i = 0x7fffffff;
		//��write����ÿ��ֻ��дһ���ֽ�
		raf.write(i>>>24);
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);
		System.out.println(raf.getFilePointer());
		
		String s = "��";
		byte[] bt = s.getBytes("GBK");
		raf.write(bt);
		System.out.println(raf.length());
		
		//���ļ������ָ���Ƶ�ͷ��
		raf.seek(0);
		//һ���Զ�ȡ
		byte[] buf = new byte[(int)raf.length()];
		raf.read(buf);
		System.out.println(Arrays.toString(buf));
		String s1 = new String(buf);
		System.out.println(s1);
		raf.close();
	}

}
