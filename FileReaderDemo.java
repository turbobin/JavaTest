/*
 * ��ȡ�ļ�
 */
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����һ����ȡ������
		FileReader fr = new FileReader("C:/Users/hmx/Desktop/aaa.txt");
		
		
		/*��һ�ֶ�ȡ��ʽ�����ö�ȡ�������read����,read():һ�ζ�ȡһ���ַ����һ��Զ���ȡ��һ���ַ�
		int ch = 0;
//		ch = fr.read();
		while ((ch=fr.read())!=-1)
			System.out.println("ch="+(char)ch);//�����ȡ���ո�ͻ��з�
		
		*/
		
		/*�ڶ��ֶ�ȡ��ʽ�� read(char[])���ص��Ƕ����ַ�������
		char[] buf = new char[1024];//2k�ֽڣ�1 char = 2 byte
		int num = 0;
		while((num=fr.read(buf))!=-1)
		{
			System.out.println(num);
			System.out.println(new String(buf,0,num));
		}
		fr.close();
		*/
		
		//�����ֶ�ȡ��ʽ��������������ʹ��readline()����
		BufferedReader bufr = new BufferedReader(fr);
		String line = null;
		
		while((line=bufr.readLine())!=null)	//�����ļ�ĩβʱ������null,
			//ע�⣺��ȡһ��ĩβ����������ֹ��
		{
			System.out.println(line);
		}
		bufr.close();
		
		

	}

}
