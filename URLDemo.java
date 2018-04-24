import java.io.*;
import java.net.*;

/*
 * 
 */
public class URLDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		URL url = new URL("http://182.207.64.188:88/webapp?name=hahha&age=30");
		URL url = new URL("http://182.207.64.188:88/webapp");
		
		System.out.println("getFile:"+url.getFile());
		System.out.println("getHost:"+url.getHost());
		System.out.println("getPath:"+url.getPath());
		System.out.println("getPort:"+url.getPort());
		System.out.println("getProtocol:"+url.getProtocol());
		System.out.println("getQuery:"+url.getQuery());
		
		URLConnection connt = url.openConnection();
		System.out.println(connt);
		
//		InputStream in = connt.getInputStream();  
		InputStream in = url.openStream();
		
//		byte[] buf = new byte[1024];
//		int len = in.read(buf);
//		System.out.println(new String(buf,0,len));
		
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(in,"utf-8"));
		String line = null;
		while((line=bufIn.readLine())!=null)
		{
			System.out.println(line);
		}
		
	}

}
/*
 String getFile() 
          ��ȡ�� URL ���ļ����� 
 String getHost() 
          ��ȡ�� URL ����������������ã��� 
 String getPath() 
          ��ȡ�� URL ��·�����֡� 
 int getPort() 
          ��ȡ�� URL �Ķ˿ںš� 
 String getProtocol() 
          ��ȡ�� URL ��Э�����ơ� 
 String getQuery() 
          ��ȡ�� URL �Ĳ�ѯ���֡� 

*/
