package io;

import java.io.File;
import java.io.IOException;

/*
 * File类的一些常用操作如过滤，遍历
 */
public class FileUtils {

	/**
	 * 列出指定目录下（包括其子目录）的所有文件
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录：" + dir + "不存在!");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir + "不是目录!");
		}
		/*String[] filenames = dir.list();//返回的是字符串数组，不包含子目录下的内容
		for(String name: filenames){
			System.out.println(dir + "\\" + name);
		}*/
		//遍历子目录则要构造成File对象做递归操作
		File[] files = dir.listFiles();
		if(files != null && files.length > 0){
			for(File file: files){
				if(file.isDirectory()){
					//递归
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
		
	}

}
