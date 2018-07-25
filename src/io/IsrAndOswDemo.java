package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*字符流的输入输出流
 * InputStream和OutputStream
 */
public class IsrAndOswDemo {

	public static void main(String[] args) throws IOException {
		// 
		FileInputStream in = new FileInputStream("D://学习笔记/java-io/联想.txt");
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//默认为项目的编码
		/*int c;
		while((c = isr.read()) != -1){
			System.out.println((char)c);
		}*/
		
		FileOutputStream out = new FileOutputStream("D://学习笔记/java-io/111.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
		
		char[] buffer = new char[8*1024];
		int c;
		//批量读取，放入buffer这个数组，从0开始最多放buffer.length个
		//返回的是读取的个数
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
