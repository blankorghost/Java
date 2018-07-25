package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ļ���д������
 */
public class IOUtils {

	/**
	 * ��ȡָ���ļ����ݣ�����16�������������̨
	 * ����û���10��byte����
	 * @param file_name
	 * @throws IOException 
	 */
	public static void printHex(String file_name) throws IOException{
		//���ļ���Ϊ�ֽ������ж�����
		FileInputStream in = new FileInputStream(file_name);
		int b;
		int i = 1;
		while((b = in.read()) != -1){
			if(b <= 0xf){
				//��λ��ǰ�油0
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b) + " ");
			if(i++%10 == 0){
				System.out.println();
			}
		}
		in.close();
	}
	
	public static void printHexByByteArray(String file_name) throws IOException{
		FileInputStream in = new FileInputStream(file_name);
		byte[] buf = new byte[20*1024];
		/*
		 * ��int��������ȡ�ֽڣ����뵽buf����ֽ�������
		 * �ӵ�0��λ�ÿ�ʼ�ţ�����buf.length��
		 * ���ص��Ƕ������ֽڵĸ���
		 */
		/*int bytes = in.read(buf,0,buf.length);//һ���Զ���˵���ֽ������㹻��
		int j = 1;
		for(int i = 0; i < bytes; i++){
			if(buf[i] <= 0xf){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(buf[i]) + " ");
			if(j++%10 == 0){
				System.out.println();
			}
		}*/
		
		int bytes = 0;
		int j = 1;
		while((bytes = in.read(buf,0,buf.length)) != -1){
			for(int i = 0; i < bytes; i++){
				System.out.print(Integer.toHexString(buf[i] & 0xff) + " ");
				if(j++%10 == 0){
					System.out.println();
				}
			}
		}
	}
	
	
	public static void copyFile(File srcFile, File desFile) throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ���" + srcFile + "������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile + "�����ļ�");
		}
		
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(desFile);
		byte[] buf = new byte[8*1024];
		int b;
		while((b = in.read(buf,0,buf.length)) != -1){
			out.write(buf, 0, buf.length);
			out.flush();//��ü���
		}
		in.close();
		out.close();
	}
	
	/**
	 * �����ļ����������ô�������ֽ���
	 * @param srcFile
	 * @param desFile
	 * @throws IOException
	 */
	public static void copyFileByBuffer(File srcFile, File desFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ���" + srcFile + "������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile + "�����ļ�");
		}
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFile));
		
		int c;
		while((c = bis.read()) != -1){
			bos.write(c);
			bos.flush();
		}
		bis.close();
		bos.close();
	}
}

