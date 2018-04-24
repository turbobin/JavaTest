import java.net.*;
/*
 * 需求：
 * 定义一个应用程序，用于接收UDP协议传输的数据并处理
 * 
 * 定义UDP的接收端。
 * 思路：
 * 1，定义updsocket服务，通常会监听一个端口，给这个接收网络应用程序定义数子标识，
 * 		方便于明确哪些数据过来应用数据可以处理。
 * 
 * 2，定义一个数据包，因为要存储接收到的字节数据。
 * 
 * 3，通过socket服务的receive方法将收到的数据存入已定义好的数据包中。
 * 4，通过数据包对象的特有功能，将这些不同的数据取出，打印在控制台上。
 * 5，关闭资源。
 */
public class UDPReceive {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(10001);
		while(true)
		{
			byte[] buf = new byte[1024];
			
			//DatagramPacket(byte[] buf, int length) 
			DatagramPacket dp = 
					new DatagramPacket(buf,buf.length);
			
			ds.receive(dp);
			
			String ip = dp.getAddress().getHostAddress();
			String data = new String(dp.getData(),0,dp.getLength());
			
			int port = dp.getPort();
			
			System.out.println(ip+":"+data+":"+port);
		}
		
//		ds.close();

	}

}
