import java.net.*;
import java.io.*;
/*
 * �����ϴ�ͼƬ
 */


/**
 * �ͻ��ˣ�
 * 1������˵㡣
 * 2����ȡ�ͻ������е�ͼƬ���ݡ�
 * 3��ͨ��socket����������ݷ�������ˡ�
 * 4���ر���Դ��
 */

class UploadPicClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length!=1)	
		{
			System.out.println("��ѡ��һ���ļ�");
			return;
		}
		
		File file = new File(args[0]);
		if(!(file.exists() && file.isFile()))
		{
			System.out.println("���ļ�������");
			return;
		}
		if(!file.getName().endsWith(".png"))
		{
			System.out.println("ͼƬ��ʽ������");
			return;
		}
		if(file.length()>1024*1024*5)
		{
			System.out.println("��ѡ���ļ���СС��5M�ϴ�");
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

		s.shutdownOutput();	//����������

		InputStream in = s.getInputStream();
		byte[] bufIn = new byte[1024];
		int num = in.read(bufIn);
		System.out.println(new String(bufIn,0,num));

		fis.close();
		s.close();

	}

}

/*
 * �����:
 * ˼����Ϊ�˿����ö���ͻ���ͬʱ�������ʷ���ˣ�����˿��Խ�ÿ���ͻ��˷�װ��
 * һ���������߳��У������Ϳ���ͬʱ��������ͻ��˵�����
 * 
 * ��ζ����߳��أ�
 * ֻҪ��ȷ��ÿ���ͻ���Ҫ�ڷ����ִ�еĴ��뼴�ɣ����ô�����뵽run������
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
			System.out.println(ip+"�����ӷ����");

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
			out.write("�ϴ��ɹ�".getBytes());

			fos.close();
			s.close();
		}catch(Exception e)
		{
			throw new  RuntimeException("�ϴ�ʧ��");
		}
//		ss.close();
	}
}