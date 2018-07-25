package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * 基于UDP协议的Socket通信，实现用户登录
 * 服务器端
 */
public class UdpSocket {

	public static void main(String[] args) throws IOException {
		try {
			//1.创建服务器端DatagramSocket,指定端口
			DatagramSocket socket = new DatagramSocket(10000);
			//2.创建服务器端DatagramPacket,接收数据、
			byte[] data = new byte[1024];//创建字节数组，指定接收的数据包的大小
			DatagramPacket packet = new DatagramPacket(data,data.length);
			
			//3.接收客户端发送的数据
			System.out.println("****服务器端已经启动，等待客户端发送数据****");
			socket.receive(packet);//此方法在接收到数据报之前会一直阻塞
			
			//4.读取数据
			String info = new String(data, 0, packet.getLength());
			System.out.println("我是服务器，客户端说：" + info);
			
			//5.向客户端响应
			//定义客户端的地址，端口，数据
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			byte[] data2 = "欢迎您".getBytes();
			//创建数据报，包含响应信息
			DatagramPacket packet2 = new DatagramPacket(data2,data2.length,address,port);
			//响应客户端
			socket.send(packet2);
			//关闭资源
			socket.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
