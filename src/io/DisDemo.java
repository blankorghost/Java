package io;
import java.io.DataInputStream;
import java.io.FileInputStream;
/*
 * DataInputStream
 */
import java.io.IOException;

public class DisDemo {

	public static void main(String[] args) throws IOException{
		// 
		String file = "demo/dos.dat";
		DataInputStream dis = new DataInputStream(
				new FileInputStream(file));
		int i = dis.readInt();
		System.out.println(i);
		i = dis.readInt();
		System.out.println(i);
		dis.close();
	}

}
