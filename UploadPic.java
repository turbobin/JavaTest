import java.net.*;
import java.io.*;
/*
 * 需求：上传图片
 */


/**
 * 客户端：
 * 1，服务端点。
 * 2，读取客户端已有的图片数据。
 * 3，通过socket输出流将数据发给服务端。
 * 4，关闭资源。
 */

class UploadPicClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length!=1)	
		{
			System.out.println("请选择一个文件");
			return;
		}
		
		File file = new File(args[0]);
		if(!(file.exists() && file.isFile()))
		{
			System.out.println("该文件不存在");
			return;
		}
		if(!file.getName().endsWith(".png"))
		{
			System.out.println("图片格式有问题");
			return;
		}
		if(file.length()>1024*1024*5)
		{
			System.out.println("请选择文件大小小于5M上传");
		}
		
		
		Socket s = new Socket("182.207.112.139",10008);

		FileInputStream fis = new FileInputStream(file);
		OutputStream out = s.getOutputStream();

		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read(buf))!=-1)
		{
			out.write(buf,0,len);
		}

		s.shutdownOutput();	//定义结束标记

		InputStream in = s.getInputStream();
		byte[] bufIn = new byte[1024];
		int num = in.read(bufIn);
		System.out.println(new String(bufIn,0,num));

		fis.close();
		s.close();

	}

}

/*
 * 服务端:
 * 思考：为了可以让多个客户端同时并发访问服务端，服务端可以将每个客户端封装到
 * 一个单独的线程中，这样就可以同时出来多个客户端的请求。
 * 
 * 如何定义线程呢？
 * 只要明确了每个客户端要在服务端执行的代码即可，将该代码存入到run方法中
 */
class UploadPicServer {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(10008);
		while(true)
		{
			Socket s = ss.accept();
			new Thread(new PicServerThread(s)).start();
		}

	}

}
class PicServerThread implements Runnable
{
	private Socket s;
	PicServerThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		int count = 1;
		try{
			String ip = s.getInetAddress().getHostAddress();
			System.out.println(ip+"已连接服务端");

			InputStream in = s.getInputStream();
			
			File file = new File("C:/Users/hmx/desktop/"+ip+".png");
			
			while(file.exists())
				file = new File("C:/Users/hmx/desktop/"+ip+"("+(count++)+").png");
				
			FileOutputStream fos = new FileOutputStream(file);

			byte[] buf = new byte[1024];
			int len = 0;
			while((len=in.read(buf))!=-1)
			{
				fos.write(buf,0,len);
			}

			OutputStream out = s.getOutputStream();
			out.write("上传成功".getBytes());

			fos.close();
			s.close();
		}catch(Exception e)
		{
			throw new  RuntimeException("上传失败");
		}
//		ss.close();
	}
}