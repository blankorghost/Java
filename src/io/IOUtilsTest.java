package io;

import java.io.File;
import java.io.IOException;

/*
 * IO��д������
 */
public class IOUtilsTest {

	public static void main(String[] args) {
		try {
			//IOUtils.printHex("D://ѧϰ�ʼ�/java-io/FileUtils.java");
			//IOUtils.printHexByByteArray("D://ѧϰ�ʼ�/java-io/FileUtils.java");
			//IOUtils.copyFile(new File("D://demo/out.dat"), new File("D://demo/int.dat"));
			IOUtils.copyFileByBuffer(new File("D://ѧϰ�ʼ�/java-io/����.txt"),
					new File("D://ѧϰ�ʼ�/java-io/111.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
