import java.net.*;
import java.io.*;
/*
 * �ͻ���ͨ������¼���û�����
 * ����˶�����û������м��顣
 * 
 * 1��������û����ڣ��ڷ������ʾXXX�ѵ�½�����ڿͻ�����ʾXXX��ӭ��½��
 * 2��������û������ڣ��ڷ��������ʾXXX���Ե�½�����ڿͻ�����ʾXXX�û������ڡ�
 * 3������������3�Σ���ǿ�ƿͻ����˳���
 * 
 */


class LoginClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("182.207.112.139",10009);
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out =
				new  PrintWriter(s.getOutputStream(),true);

		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));

		for(int x=0; x<3; x++)
		{
			String line = bufr.readLine();
			if(line==null)
				break;
			
			out.println(line);

			String str = bufIn.readLine();
			System.out.println(str);
			if(str.contains("��ӭ��½"))
				break;
		}

		bufr.close();
		s.close();
	}

}

class LoginServer {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(10009);
		while(true)
		{
			Socket s = ss.accept();
			new Thread(new LoginThread(s)).start();
		}
	}
}
class LoginThread implements Runnable
{
	private Socket s;
	LoginThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		try{
			String ip = s.getInetAddress().getHostAddress();
			System.out.println(ip+"�����ӷ����");

			for(int x=0; x<3;x++)
			{
				BufferedReader bufIn = 
						new BufferedReader(new InputStreamReader(s.getInputStream()));
				String name = bufIn.readLine();

				BufferedReader bufr = 
						new BufferedReader(new FileReader("C:/Users/hmx/desktop/user.txt"));
				PrintWriter out =
						new  PrintWriter(s.getOutputStream(),true);

				String line = null;
				boolean flag = false;
				while((line=bufr.readLine())!=null)
				{
					if(line.equals(name))
					{
						flag = true;
						break;
					}

				}
				if(flag)
				{
					System.out.println(name+"�ѵ�½");
					out.println(name+"��ӭ��½");
					break;
				}
				else
				{
					System.out.println(name+"���Ե�½");
					out.println("�û���������:"+name);
				}

			}
			s.close();

		}catch(Exception e)
		{
			throw new  RuntimeException("У��ʧ��");
		}
		//		ss.close();
	}
}