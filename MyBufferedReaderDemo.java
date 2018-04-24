/*
 * װ�����ģʽ��
 * ����Ҫ�����еĶ�����й�����ǿʱ�����Զ����࣬�����ж����룬
 * �������еĹ��ܣ����ṩ��ǿ�Ĺ��ܣ���ô�Զ�������Ϊװ���ࡣ
 * 
 * װ����ͨ����ͨ������ �������ձ�װ�� �Ķ���
 * �����ڱ�װ�εĶ���Ĺ��ܣ��ṩ��ǿ�Ĺ��ܡ�
 * 
 * 	readline()������ʵ����read()������ ��ǿ��������ģ��һ��BufferedReader����
 */
import java.io.*;
class MyBufferedReader
{
	private FileReader r;
	MyBufferedReader(FileReader r)
	{
		this.r = r;
	}
	
	public String myreadline() throws IOException
	{
		//ԭBufferedReader��װ�����ַ����飬Ϊ��ģ�ⷽ�㣬����һ��StringBuilder������
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while((ch=r.read())!=-1)
		{
			if(ch=='\r')
			{
//				System.out.println((char)ch);
				continue;
			}
			if(ch=='\n')
			{
//				System.out.println((char)ch);
				return sb.toString();
			}
			else
				sb.append((char)ch);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
}
public class MyBufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new  FileReader("C:/Users/hmx/Desktop/aaa.txt");
		MyBufferedReader bufw = new MyBufferedReader(fr);
		String line = null;
		while((line=bufw.myreadline())!=null)
		{
			System.out.println(line);
		}

	}

}
