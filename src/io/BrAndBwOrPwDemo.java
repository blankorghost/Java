package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/*
 * 字符流的过滤器
 * BufferReader, BufferWriter
 */
public class BrAndBwOrPwDemo {

	public static void main(String[] args) throws IOException {
		// 对文件进行读写
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("D://学习笔记/java-io/联想.txt"),"utf-8"));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("D://学习笔记/java-io/111.txt"),"utf-8"));
		PrintWriter pw = new PrintWriter("D://学习笔记/java-io/122.txt","utf-8");
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);//不能识别换行
			bw.write(line);
			//单独换行
			bw.newLine();//换行操作
			bw.flush();
			pw.println(line);
			pw.flush();
		}
		br.close();
		bw.close();
		pw.close();
	}

}
