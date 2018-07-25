package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ����TCPЭ���Socketͨ�ţ�ʵ���û���¼
 * ��������
 */
public class Server {

	public static void main(String[] args){
		
		try {
			//1.����һ���������˵�Socket����ServerSocket��ָ���󶨶˿ڣ��������˶˿�
			ServerSocket serverSocket = new ServerSocket(10000);
			Socket socket = null;
			//��¼�ͻ��˵�����
			int count = 0;
			System.out.println("****�������˼����������ȴ��ͻ��˵�����****");
			//ѭ�������ȴ��ͻ��˵�����
			while(true){
				//2.����accept()������ʼ�������ȴ��ͻ��˵�����
				socket = serverSocket.accept();
				//����һ���µ��߳�
				ServerThread serverThread = new ServerThread(socket);
				//�����߳�
				serverThread.start();
				
				count++;//ͳ�ƿͻ��˵�����
				System.out.println("�ͻ��˵�������" + count);
				InetAddress address = socket.getInetAddress();
				System.out.println("�ͻ��˵�IP��" + address.getHostAddress());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
