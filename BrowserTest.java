import java.net.*;
import java.io.*;
/*
 * ��ʾ�ͻ��˺ͷ���ˡ�
 * 1��
 * �ͻ��ˣ��������
 * ����ˣ��Զ��塣
 */
public class BrowserTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(11000);
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"�����ӷ����");
		
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
//		out.println("<font color='red size='7'>��������ccb������</font>");
		out.println("��������ccb������");
		s.close();
		ss.close();

	}

}
