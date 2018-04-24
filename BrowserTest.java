import java.net.*;
import java.io.*;
/*
 * 演示客户端和服务端。
 * 1，
 * 客户端：浏览器。
 * 服务端：自定义。
 */
public class BrowserTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(11000);
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"已连接服务端");
		
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
//		out.println("<font color='red size='7'>你已连接ccb的主机</font>");
		out.println("你已连接ccb的主机");
		s.close();
		ss.close();

	}

}
