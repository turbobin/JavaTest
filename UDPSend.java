import java.io.*;
import java.net.*;
/*
 * ����ͨ��UDP���䷽ʽ����һ�����ַ��ͳ�ȥ��
 * 
 * ˼·��
 * 1������updsocket����
 * 2���ṩ���ݣ��������ݷ�װ�����ݰ��С�
 * ͨ��socket����ķ��͹��ܣ������ݰ����ͳ�ȥ��
 * 4���ر���Դ��
 */
public class UDPSend {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		//1,����UDP����ͨ��DatagramSocket����
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
