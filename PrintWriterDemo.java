/*
 * ��ӡ����
 * �����ṩ���˴�ӡ���������Խ������������͵�����ԭ����ӡ
 * 
 * �ֽڴ�ӡ����
 * PringSteam
 * ���캯�����Խ��յĲ������ͣ�
 * 1��File����
 * 2���ַ���·����String
 * 3���ֽ��������OutPutStream
 * 
 * �ַ���ӡ�������ã���
 * PrintWriter
 * 1��File����
 * 2���ַ���·����String
 * 3���ֽ��������OutPutStream
 * 4���ַ���ӡ�� ��Writer
 */
import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		
//		PrintWriter out = 
//				new PrintWriter(new FileWriter("C:/Users/hmx/Desktop/aaa.txt"),true);
		//true��ʾ�Զ�ͬ��ˢ���ڴ����ݵ�Ŀ���ļ�
		
		PrintWriter out = 
				new PrintWriter(new File("C:/Users/hmx/Desktop/aaa.txt"),"utf-8");
		//��ָ�����ַ��������Ŀ���ļ�
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if ("quit".equals(line))
				break;
			
			out.println(line);
		}
		out.close();
		bufr.close();

	}

}
