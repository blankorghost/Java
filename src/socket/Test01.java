package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * InetAddress��
 * @author ghost
 *
 */
public class Test01 {

	public static void main(String[] args) throws UnknownHostException {
		// ��ȡ������InetAddressʵ��
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("���������" + address.getHostName());
		System.out.println("IP��ַ��" + address.getHostAddress());
		byte[] bt = address.getAddress();//��ȡ�ֽ�������ʽ��IP��ַ
		System.out.println("�ֽ�������ʽ��IP��ַ��" + Arrays.toString(bt));
		System.out.println(address);
		
		//���ݼ��������ȡInetAddressʵ��
		InetAddress address2 = InetAddress.getByName("DESKTOP-SQQ22FO");
		System.out.println(address2);
		
		

	}

}
