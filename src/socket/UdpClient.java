package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

	public static void main(String[] args) throws IOException {
		//1.����������ĵ�ַ���˿ںţ�����
		InetAddress address = InetAddress.getByName("localhost");
		int port = 10000;
		byte[] data ="�û�����user;���룺1234".getBytes();
		//2.�������ݱ����������͵�������Ϣ
		DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
		//3.����DatagramSocket����
		DatagramSocket socket = new DatagramSocket();
		//4.��������˷�������
		socket.send(packet);
		
		//5.���շ���������Ӧ������
		//�������ݱ����շ�����������
		byte[] data2 = new byte[1024];
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
		//���շ���������Ϣ
		socket.receive(packet2);
		//��ȡ����
		String reply = new String(data2, 0, packet2.getLength());
		System.out.println("���ǿͻ��ˣ�������˵��" + reply);
		socket.close();
	}

}
