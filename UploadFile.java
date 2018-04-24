import java.net.*;
import java.io.*;
/*
 * �����ϴ��ı��ļ�/�����ͻ����ļ��������
 */
class UploadFileClinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("182.207.112.139",10007);
		BufferedReader bufr = 
				new BufferedReader(new FileReader("IPDemo.java"));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			out.println(line);
		}
		
		s.shutdownOutput();	//�رտͻ������������൱�ڸ����м���һ���������-1.
		
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = bufIn.readLine();
		System.out.println(str);
		
		bufr.close();
		s.close();
		
	}

}

class UploadFileServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(10007);
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"�����ӷ�����");
		InputStream in = s.getInputStream();
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(in));
		PrintWriter out = new PrintWriter(new FileWriter("copyIPDemo.txt"),true);
		
		String line = null;
		while((line=bufIn.readLine())!=null)
		{
			out.println(line);
		}
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("�ϴ��ɹ�");
		
		out.close();
		s.close();
		ss.close();
	}

}