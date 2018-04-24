/*
 * 装饰设计模式：
 * 当想要对已有的对象进行功能增强时，可以定义类，将已有对象传入，
 * 基于已有的功能，并提供加强的功能，那么自定义的类称为装饰类。
 * 
 * 装饰类通常会通过构造 方法接收被装饰 的对象。
 * 并基于被装饰的对象的功能，提供更强的功能。
 * 
 * 	readline()方法其实就是read()方法的 增强，下面来模拟一个BufferedReader对象
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
		//原BufferedReader封装的是字符数组，为了模拟方便，定义一个StringBuilder容器。
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
