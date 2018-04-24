import java.io.*;
import java.net.*;
/*
 * 服务端：
 * 源：socket读取流。
 * 目的：socket输出流
 * 都是文本。
 */
public class TransServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(10006);
		
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"已连接服务端");
		
		//读取socket读取流中的数据。
		InputStream in = s.getInputStream();
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(in));
		//目的，socket输出流。将大写数据写入到socket输出流，并发送给客户端。
		OutputStream out = s.getOutputStream();
//		BufferedWriter bufOut = 
//				new BufferedWriter(new OutputStreamWriter(out));
		//优化：
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
该例子出现问题：
现象：客户端和服务端都在莫名 等待。
为什么呢？
因为客户端和服务端都有阻塞式方法，这些方法没有读到结束式标记（换行符），
而导致两端都在等待。
优化 ：使用PrintWriter  ,out.println()方法

*/
