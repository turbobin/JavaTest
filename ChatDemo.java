import java.io.*;
import java.net.*;

/*
 * 编写一个聊天程序。
 * 
 * 收数据和发数据两部分同时执行。
 * 需要用到多线程技术。
 * 一个线程控制接收，一个线程控制发送。
 * 
 */

class Send implements Runnable
{
	private DatagramSocket ds;
	Send(DatagramSocket ds)
	{
		this.ds = ds;
	}
	public void run()
	{
		try
		{
			BufferedReader bufread =
					new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line=bufread.readLine())!=null)
			{
				
				byte[] buf = line.getBytes();
			
			//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
				DatagramPacket dp = 
					new DatagramPacket(buf,buf.length,InetAddress.getByName("182.207.112.255"),10002);
			
				ds.send(dp);
			}
			
		}catch(Exception e)
		{
			throw new RuntimeException("发送失败");
		}
	}
}

class Recieve implements Runnable
{
	private DatagramSocket ds;
	Recieve(DatagramSocket ds)
	{
		this.ds = ds;
	}
	public void run()
	{
		try{
			while(true)
			{
				byte[] buf = new byte[1024];
				
				//DatagramPacket(byte[] buf, int length) 
				DatagramPacket dp = 
						new DatagramPacket(buf,buf.length);
				
				ds.receive(dp);
				
				String ip = dp.getAddress().getHostAddress();
				String name = dp.getAddress().getHostName();
				String data = new String(dp.getData(),0,dp.getLength());
				
//				int port = dp.getPort();
				
				System.out.println(name+"("+ip+"):"+"\r\n"+data);
			}
			
		}catch(Exception e)
		{
			throw new RuntimeException("接收失败");
		}
	}
}
public class ChatDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket sendSocket = new DatagramSocket();
		DatagramSocket recieveSocket = new DatagramSocket(10002);
		
		new Thread(new Send(sendSocket)).start();
		new Thread(new Recieve(recieveSocket)).start();

	}

}
