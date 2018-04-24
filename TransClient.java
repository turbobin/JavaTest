import java.io.*;
import java.net.*;
/*
 * 需求：建立一个文本转换服务器。
 * 客户端给服务端发送文本，服务端会将 文本转成大写再返回给客户端。
 * 而且客户端可以不断的进行文本转换，当客户端输入quit时，转换结束并退出。

 * 步骤
 * 1，建立服务
 * 2，获取键盘录入
 * 3，将数据发给服务端
 * 4，获取服务端返回的大写数据。
 * 5，结束，关资源
 * 
 * 都是文本数据，可以使用字符流进行操作，同时提高效率，加入缓冲。
 */
public class TransClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("182.207.112.139",10006);
		
		//定义读取键盘数据的流对象。
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		//定义目的，将数据写入到socket输出流，发给服务端。
		OutputStream out = s.getOutputStream();
//		BufferedWriter bufOut = 
//				new BufferedWriter(new OutputStreamWriter(out));
		PrintWriter prtout = new  PrintWriter(out,true);
		//定义一个socket读取流，读取服务端返回的大写数据信息。
		InputStream in = s.getInputStream();
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(in));
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("quit".equals(line))
				break;
			
			prtout.println(line);
//			bufOut.write(line);
//			bufOut.newLine();
//			bufOut.flush();
			
			String str = bufIn.readLine();
			System.out.println("server->"+str);
		}
		
		bufr.close();
		s.close();
	}

}
