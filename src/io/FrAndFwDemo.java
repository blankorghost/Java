package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ���֮�ļ���д��
 * FileWriter,FileReader
 */
public class FrAndFwDemo {

	public static void main(String[] args) throws IOException {
		// 
		FileReader fr = new FileReader("D://ѧϰ�ʼ�/java-io/����.txt");
		FileWriter fw = new FileWriter("D://ѧϰ�ʼ�/java-io/111.txt",true);//true��ʾ׷������
		char[] buffer = new char[2056];
		int c;
		while((c = fr.read(buffer, 0, buffer.length)) != -1){
			fw.write(buffer,0,c);
			fw.flush();
		}
		fw.close();
		fr.close();
	}

}
