package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*�ַ��������������
 * InputStream��OutputStream
 */
public class IsrAndOswDemo {

	public static void main(String[] args) throws IOException {
		// 
		FileInputStream in = new FileInputStream("D://ѧϰ�ʼ�/java-io/����.txt");
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//Ĭ��Ϊ��Ŀ�ı���
		/*int c;
		while((c = isr.read()) != -1){
			System.out.println((char)c);
		}*/
		
		FileOutputStream out = new FileOutputStream("D://ѧϰ�ʼ�/java-io/111.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
		
		char[] buffer = new char[8*1024];
		int c;
		//������ȡ������buffer������飬��0��ʼ����buffer.length��
		//���ص��Ƕ�ȡ�ĸ���
		while((c = isr.read(buffer,0,buffer.length)) !=-1){
			String s = new String(buffer,0,c);
			osw.write(buffer,0,c);
			osw.flush();
			System.out.println(s);
		}
		osw.close();
		isr.close();
	}

}
