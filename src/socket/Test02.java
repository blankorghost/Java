package socket;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL�ĳ��÷���
 */
public class Test02 {

	public static void main(String[] args) {
		// ����һ��URLʵ��
		try {
			URL lp = new URL("https://www.imooc.com");
			//?��ʾ������#��ʾê��
			URL url = new URL(lp, "/index.html?username=tom#test");
			
			System.out.println("Э�飺" + url.getProtocol());
			System.out.println("������" + url.getHost());
			//���δָ���˿ںţ���ʹ��Ĭ�ϵĶ˿ںţ���ʱgetPort()��������ֵΪ-1
			System.out.println("�˿ڣ�" + url.getPort());
			System.out.println("�ļ�·����" + url.getPath());
			System.out.println("�ļ�����" + url.getFile());
			System.out.println("���·����" + url.getRef());
			System.out.println("��ѯ�ַ�����" + url.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
