package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream
 */
public class DosDemo {

	public static void main(String[] args) throws IOException{
		// 
		String file = "demo/dos.dat";
		DataOutputStream dos = new DataOutputStream(
				new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(10l);
		dos.writeDouble(10.8);
		//采用utf-8写出
		dos.writeUTF("中国");
		
		dos.writeChars("中国");
		dos.close();
		IOUtils.printHex(file);
	}

}
