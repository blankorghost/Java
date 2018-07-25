package io;

import java.io.File;
import java.io.IOException;

/*
 * IO读写测试类
 */
public class IOUtilsTest {

	public static void main(String[] args) {
		try {
			//IOUtils.printHex("D://学习笔记/java-io/FileUtils.java");
			//IOUtils.printHexByByteArray("D://学习笔记/java-io/FileUtils.java");
			//IOUtils.copyFile(new File("D://demo/out.dat"), new File("D://demo/int.dat"));
			IOUtils.copyFileByBuffer(new File("D://学习笔记/java-io/联想.txt"),
					new File("D://学习笔记/java-io/111.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
