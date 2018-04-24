/*
 * ��ȡ����¼��
 * �ֽ������ַ����Ļ���ת�� 
 * 
 * �������Ļ������ɣ�
 * 
 * 1����ȷԴ��Ŀ��
 * 	Դ��   ������ -> InputStream , Reader
 * 	Ŀ�ģ������ -> OutputStream �� Writer
 * 
 * 2����ȷ�����������Ƿ��Ǵ��ı���
 * 	�� -> �ַ���
 * 	�� -> �ֽ���
 * 
 * 3����ϵ��ȷ������ȷҪʹ���ĸ��������
 * ͨ���豸���������֣�
 * Դ�豸���ڴ棬Ӳ�̣�����
 * Ŀ���豸���ڴ棬Ӳ�� ������̨
 * 
 * 
 * !!!���Ҫָ����������������ʹ��ת������
 * InputStreamReader �� OutputStreamWriter
 */
import java.io.*;

public class ReadSysin {

	public static void main(String[] args) throws IOException {
		
//		System.out.println('A'+0);
		
		/** 1  */
//		byte[] buf = new byte[1024];
		InputStream in = System.in;
//		
//		int num = 0;
//		while((num=in.read(buf))!=-1)
//		{
//			System.out.println(new String(buf,0,num));
//		} 
		
		
		/** 2  */
//		BufferedInputStream bufr = new BufferedInputStream(in);
//		byte[] buf = new byte[1024];
//		int num = 0;
//		while((num=bufr.read(buf))!=-1)
//		{
//			String s  = new String(buf,0,num);
//			
//			System.out.print(s);
//		}
//		bufr.close();
		
		/* �ı��׼����������������ļ�ͨ�÷���(ţ~!!)  */
		System.setIn(new FileInputStream("C:/Users/hmx/Desktop/VSAVE.txt"));
		System.setOut(new PrintStream("C:/Users/hmx/Desktop/SAVE.txt"));
		
		/** 3  */
		//��ȡ����¼����󣬽��ֽ�������ת�����ַ�������ʹ��ת������InputStreamReader
		InputStreamReader instr = new InputStreamReader(System.in);
		//Ϊ�����Ч�ʣ����ַ������л��壬ʹ��BufferedReader
		BufferedReader bufr = new BufferedReader(instr);
		
		/** 4  */
		//ʹ�ñ�׼����������ַ���ת�����ֽ�����ӡ
		BufferedWriter bufw = 
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("quit".equals(line))
				break;
			
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
//			System.out.println(line);
		}
		
		bufr.close();
		bufw.close();
				

	}

}
