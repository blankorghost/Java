package io;

import java.io.File;
import java.io.IOException;

/*
 * File���һЩ���ò�������ˣ�����
 */
public class FileUtils {

	/**
	 * �г�ָ��Ŀ¼�£���������Ŀ¼���������ļ�
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������!");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir + "����Ŀ¼!");
		}
		/*String[] filenames = dir.list();//���ص����ַ������飬��������Ŀ¼�µ�����
		for(String name: filenames){
			System.out.println(dir + "\\" + name);
		}*/
		//������Ŀ¼��Ҫ�����File�������ݹ����
		File[] files = dir.listFiles();
		if(files != null && files.length > 0){
			for(File file: files){
				if(file.isDirectory()){
					//�ݹ�
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
		
	}

}
