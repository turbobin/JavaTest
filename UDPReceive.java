import java.net.*;
/*
 * ����
 * ����һ��Ӧ�ó������ڽ���UDPЭ�鴫������ݲ�����
 * 
 * ����UDP�Ľ��նˡ�
 * ˼·��
 * 1������updsocket����ͨ�������һ���˿ڣ��������������Ӧ�ó��������ӱ�ʶ��
 * 		��������ȷ��Щ���ݹ���Ӧ�����ݿ��Դ���
 * 
 * 2������һ�����ݰ�����ΪҪ�洢���յ����ֽ����ݡ�
 * 
 * 3��ͨ��socket�����receive�������յ������ݴ����Ѷ���õ����ݰ��С�
 * 4��ͨ�����ݰ���������й��ܣ�����Щ��ͬ������ȡ������ӡ�ڿ���̨�ϡ�
 * 5���ر���Դ��
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
