package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * ʹ��URL��ȡҳ������
 */
public class Test03 {

	public static void main(String[] args) {
		// ����URLʵ��
		try {
			URL url = new URL("https://www.baidu.com");
			//ͨ��URL��openStream������ȡURL��������ʾ����Դ���ֽ�������
			InputStream is = url.openStream();
			//���ֽ�������ת��Ϊ�ַ�������
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			//Ϊ�ַ�����ӻ�����߶�ȡЧ��
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine(); //��ȡ����
			while(data != null){//ѭ����ȡ����
				System.out.println(data);
				data = br.readLine();
			}
			br.close();
			isr.close();
			is.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
