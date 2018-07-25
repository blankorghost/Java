package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流之文件读写流
 * FileWriter,FileReader
 */
public class FrAndFwDemo {

	public static void main(String[] args) throws IOException {
		// 
		FileReader fr = new FileReader("D://学习笔记/java-io/联想.txt");
		FileWriter fw = new FileWriter("D://学习笔记/java-io/111.txt",true);//true表示追加内容
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
