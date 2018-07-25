package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

	public static void main(String[] args) throws IOException {
		//1.定义服务器的地址，端口号，数据
		InetAddress address = InetAddress.getByName("localhost");
		int port = 10000;
		byte[] data ="用户名：user;密码：1234".getBytes();
		//2.创建数据报，包含发送的数据信息
		DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
		//3.创建DatagramSocket对象
		DatagramSocket socket = new DatagramSocket();
		//4.向服务器端发送数据
		socket.send(packet);
		
		//5.接收服务器端响应的数据
		//创建数据报接收服务器端数据
		byte[] data2 = new byte[1024];
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
		//接收服务器端信息
		socket.receive(packet2);
		//读取数据
		String reply = new String(data2, 0, packet2.getLength());
		System.out.println("我是客户端，服务器说：" + reply);
		socket.close();
	}

}
