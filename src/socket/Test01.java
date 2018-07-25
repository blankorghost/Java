package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * InetAddress类
 * @author ghost
 *
 */
public class Test01 {

	public static void main(String[] args) throws UnknownHostException {
		// 获取本机的InetAddress实例
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("计算机名：" + address.getHostName());
		System.out.println("IP地址：" + address.getHostAddress());
		byte[] bt = address.getAddress();//获取字节数组形式的IP地址
		System.out.println("字节数组形式的IP地址：" + Arrays.toString(bt));
		System.out.println(address);
		
		//根据计算机名获取InetAddress实例
		InetAddress address2 = InetAddress.getByName("DESKTOP-SQQ22FO");
		System.out.println(address2);
		
		

	}

}
