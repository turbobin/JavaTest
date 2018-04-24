import java.io.*;
import java.net.*;
/*
 * 演示TCP传输的客户端和服务端的互访。
 * 
 * 需求：客户端给服务器端发送数据，服务端收到后，给客户端反馈信息
 * 
 * 客户端：
 * 1，建立Socket服务，指定要连接的主机和端口。
 * 2，获取socket流中的输出流。要将数据写到该流中，通过网络发送给服务端。
 * 3，获取socket流中的输入流，将服务端反馈的数据获取到，并打印。、
 * 4，关闭客户端资源。
 */
public class TCPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("182.207.112.139",10005);
		OutputStream out = s.getOutputStream();
		out.write("hello,服务器".getBytes());
		
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		
		s.close();

	}

}
