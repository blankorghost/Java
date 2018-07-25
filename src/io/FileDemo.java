package io;

import java.io.File;
import java.io.IOException;

/*
 * File类API的使用
 */
public class FileDemo {

	public static void main(String[] args) {
		//了解构造函数的情况
		File file = new File("D://学习笔记/java-io/imooc.txt");
		File file2 = new File("D://学习笔记/java-io/imooc1");
		File file3 = new File("D://学习笔记/java-io/imooc1.txt");
		File file4 = new File("D://学习笔记/java-io","imooc2.txt");
		if(!file2.exists()){
			System.out.println("file2文件夹不存在，正在创建...");
			file2.mkdirs();//创建文件夹,多级目录时用mkdirs()
			System.out.println("file2文件夹创建成功！");
		}else{
			file2.delete();
		}
		if(!file3.exists()){
			System.out.println("file3文件不存在，正在创建...");
			try {
				file3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//创建文件夹
			System.out.println("file2文件创建成功！");
		}else{
			file3.delete();
		}
		if(!file4.exists()){
			System.out.println("file4文件不存在，正在创建...");
			try {
				file4.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//创建文件夹
			System.out.println("file4文件创建成功！");
		}else{
			file4.delete();
		}
		System.out.println(file.exists());
		
		//常用API
		System.out.println(file);//file.toString
		System.out.println(file.getName());
		System.out.println(file4.getName());
		System.out.println(file.getParent());

	}

}
