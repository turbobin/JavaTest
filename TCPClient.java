import java.io.*;
import java.net.*;
/*
 * ��ʾTCP����Ŀͻ��˺ͷ���˵Ļ��á�
 * 
 * ���󣺿ͻ��˸��������˷������ݣ�������յ��󣬸��ͻ��˷�����Ϣ
 * 
 * �ͻ��ˣ�
 * 1������Socket����ָ��Ҫ���ӵ������Ͷ˿ڡ�
 * 2����ȡsocket���е��������Ҫ������д�������У�ͨ�����緢�͸�����ˡ�
 * 3����ȡsocket���е���������������˷��������ݻ�ȡ��������ӡ����
 * 4���رտͻ�����Դ��
 */
public class TCPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("182.207.112.139",10005);
		OutputStream out = s.getOutputStream();
		out.write("hello,������".getBytes());
		
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		
		s.close();

	}

}
