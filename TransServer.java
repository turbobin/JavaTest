import java.io.*;
import java.net.*;
/*
 * ����ˣ�
 * Դ��socket��ȡ����
 * Ŀ�ģ�socket�����
 * �����ı���
 */
public class TransServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(10006);
		
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"�����ӷ����");
		
		//��ȡsocket��ȡ���е����ݡ�
		InputStream in = s.getInputStream();
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(in));
		//Ŀ�ģ�socket�����������д����д�뵽socket������������͸��ͻ��ˡ�
		OutputStream out = s.getOutputStream();
//		BufferedWriter bufOut = 
//				new BufferedWriter(new OutputStreamWriter(out));
		//�Ż���
		PrintWriter prtOut = new PrintWriter(out,true);
		
		String line = null;
		while((line=bufIn.readLine())!=null)
		{
//			System.out.println(line);
			prtOut.println(line.toUpperCase());
//			bufOut.write(line.toUpperCase());
//			bufOut.newLine();
//			bufOut.flush();
			
			
		}
		
		s.close();
		ss.close();
		
	}

}
/*
�����ӳ������⣺
���󣺿ͻ��˺ͷ���˶���Ī�� �ȴ���
Ϊʲô�أ�
��Ϊ�ͻ��˺ͷ���˶�������ʽ��������Щ����û�ж�������ʽ��ǣ����з�����
���������˶��ڵȴ���
�Ż� ��ʹ��PrintWriter  ,out.println()����

*/
