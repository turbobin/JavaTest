import java.io.*;
import java.net.*;
/*
 * ���󣺽���һ���ı�ת����������
 * �ͻ��˸�����˷����ı�������˻Ὣ �ı�ת�ɴ�д�ٷ��ظ��ͻ��ˡ�
 * ���ҿͻ��˿��Բ��ϵĽ����ı�ת�������ͻ�������quitʱ��ת���������˳���

 * ����
 * 1����������
 * 2����ȡ����¼��
 * 3�������ݷ��������
 * 4����ȡ����˷��صĴ�д���ݡ�
 * 5������������Դ
 * 
 * �����ı����ݣ�����ʹ���ַ������в�����ͬʱ���Ч�ʣ����뻺�塣
 */
public class TransClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("182.207.112.139",10006);
		
		//�����ȡ�������ݵ�������
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		//����Ŀ�ģ�������д�뵽socket���������������ˡ�
		OutputStream out = s.getOutputStream();
//		BufferedWriter bufOut = 
//				new BufferedWriter(new OutputStreamWriter(out));
		PrintWriter prtout = new  PrintWriter(out,true);
		//����һ��socket��ȡ������ȡ����˷��صĴ�д������Ϣ��
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
