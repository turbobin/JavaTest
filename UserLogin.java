import java.net.*;
import java.io.*;
/*
 * 客户端通过键盘录入用户名。
 * 服务端对这个用户名进行检验。
 * 
 * 1，如果该用户存在，在服务端显示XXX已登陆，并在客户端显示XXX欢迎登陆。
 * 2，如果该用户不存在，在服务端你显示XXX尝试登陆，并在客户端显示XXX用户不存在。
 * 3，如果输入错误3次，则强制客户端退出。
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
			if(str.contains("欢迎登陆"))
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
			System.out.println(ip+"已连接服务端");

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
					System.out.println(name+"已登陆");
					out.println(name+"欢迎登陆");
					break;
				}
				else
				{
					System.out.println(name+"尝试登陆");
					out.println("用户名不存在:"+name);
				}

			}
			s.close();

		}catch(Exception e)
		{
			throw new  RuntimeException("校验失败");
		}
		//		ss.close();
	}
}