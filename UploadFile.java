import java.net.*;
import java.io.*;
/*
 * 需求：上传文本文件/拷贝客户端文件到服务端
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
		
		s.shutdownOutput();	//关闭客户端输入流。相当于给流中加入一个结束标记-1.
		
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
		System.out.println(ip+"已连接服务器");
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
		pw.println("上传成功");
		
		out.close();
		s.close();
		ss.close();
	}

}