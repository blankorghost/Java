package io;

public class EncodeDemo {

	public static void main(String[] args) {
		String s = "Ľ����ABC";
		byte[] bytes1 = s.getBytes();
		for(byte b: bytes1){
			//���ֽ�ת������int��16���Ƶķ�ʽ��ʾ
			System.out.println(Integer.toHexString(b & 0xff) + " ");
		}

	}

}
