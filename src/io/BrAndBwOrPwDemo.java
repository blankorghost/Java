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
 * �ַ����Ĺ�����
 * BufferReader, BufferWriter
 */
public class BrAndBwOrPwDemo {

	public static void main(String[] args) throws IOException {
		// ���ļ����ж�д
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("D://ѧϰ�ʼ�/java-io/����.txt"),"utf-8"));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("D://ѧϰ�ʼ�/java-io/111.txt"),"utf-8"));
		PrintWriter pw = new PrintWriter("D://ѧϰ�ʼ�/java-io/122.txt","utf-8");
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);//����ʶ����
			bw.write(line);
			//��������
			bw.newLine();//���в���
			bw.flush();
			pw.println(line);
			pw.flush();
		}
		br.close();
		bw.close();
		pw.close();
	}

}
