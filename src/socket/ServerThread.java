package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 服务器端线程处理类
 */
public class ServerThread extends Thread {

	//和本线程相关的Socket
	Socket socket = null;
	public ServerThread(Socket socket){
		this.socket = socket;
	}
	
	//线程执行的操作，响应客户端的请求
	public void run(){
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		PrintWriter pw = null;
		try {
			//3.获取输入流，并读取客户端信息
			is = socket.getInputStream();
			//字节输入流
			isr = new InputStreamReader(is);//将字节流转换为字符流
			br = new BufferedReader(isr);//为输入流添加缓冲
			String info = null;
			while((info = br.readLine()) != null){
				System.out.println("我是服务器，客户端说：" + info);
			}
			socket.shutdownInput();//关闭输入流
			//4.获取输出流，响应客户端请求
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.write("欢迎您");
			pw.flush();//调用flush()方法将缓冲输出
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭资源
			try{
				if(pw != null){
					pw.close();
				}
				if(os != null){
					os.close();
				}
				if(br != null){
					br.close();
				}
				if(isr != null){
					isr.close();
				}
				if(is != null){
					is.close();
				}
				if(socket != null){
					socket.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
