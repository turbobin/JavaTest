import java.io.*;
import java.net.*;
/*
 * 需求：通过UDP传输方式，将一段文字发送出去。
 * 
 * 思路：
 * 1，建立updsocket服务。
 * 2，提供数据，并将数据封装到数据包中。
 * 通过socket服务的发送功能，将数据包发送出去。
 * 4，关闭资源。
 */
public class UDPSend {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		//1,创建UDP服务，通过DatagramSocket对象
		DatagramSocket ds = new DatagramSocket();
		
		BufferedReader bufread =
				new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		if((line=bufread.readLine())!=null)
		{
			
			byte[] buf = line.getBytes();
		
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
			DatagramPacket dp = 
				new DatagramPacket(buf,buf.length,InetAddress.getByName("182.207.112.255"),10001);
		
			ds.send(dp);
		}
		
		ds.close();
	}

}
