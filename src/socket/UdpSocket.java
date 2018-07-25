package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * ����UDPЭ���Socketͨ�ţ�ʵ���û���¼
 * ��������
 */
public class UdpSocket {

	public static void main(String[] args) throws IOException {
		try {
			//1.������������DatagramSocket,ָ���˿�
			DatagramSocket socket = new DatagramSocket(10000);
			//2.������������DatagramPacket,�������ݡ�
			byte[] data = new byte[1024];//�����ֽ����飬ָ�����յ����ݰ��Ĵ�С
			DatagramPacket packet = new DatagramPacket(data,data.length);
			
			//3.���տͻ��˷��͵�����
			System.out.println("****���������Ѿ��������ȴ��ͻ��˷�������****");
			socket.receive(packet);//�˷����ڽ��յ����ݱ�֮ǰ��һֱ����
			
			//4.��ȡ����
			String info = new String(data, 0, packet.getLength());
			System.out.println("���Ƿ��������ͻ���˵��" + info);
			
			//5.��ͻ�����Ӧ
			//����ͻ��˵ĵ�ַ���˿ڣ�����
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			byte[] data2 = "��ӭ��".getBytes();
			//�������ݱ���������Ӧ��Ϣ
			DatagramPacket packet2 = new DatagramPacket(data2,data2.length,address,port);
			//��Ӧ�ͻ���
			socket.send(packet2);
			//�ر���Դ
			socket.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
