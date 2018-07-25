package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) throws IOException{
		// 如果没有则创建，有则删除再创建
		FileOutputStream out = new FileOutputStream("D://demo/out.dat");
		out.write('A');
		out.write('B');
		int a = 10;
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		out.close();
		
		IOUtils.printHex("D://demo/out.dat");
		
	}

}
