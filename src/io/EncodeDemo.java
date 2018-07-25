package io;

public class EncodeDemo {

	public static void main(String[] args) {
		String s = "慕课网ABC";
		byte[] bytes1 = s.getBytes();
		for(byte b: bytes1){
			//把字节转换成了int以16进制的方式显示
			System.out.println(Integer.toHexString(b & 0xff) + " ");
		}

	}

}
