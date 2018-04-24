import java.io.*;
import java.net.*;
public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(10005);
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		OutputStream out = s.getOutputStream();
		Thread.sleep(5000);	//等待5秒
		out.write("服务器收到".getBytes());
		
		s.close();
		ss.close();

	}

}
