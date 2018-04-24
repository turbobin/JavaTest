/*
 * 读取文件
 */
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个读取流对象
		FileReader fr = new FileReader("C:/Users/hmx/Desktop/aaa.txt");
		
		
		/*第一种读取方式：调用读取流对象的read方法,read():一次读取一个字符，且会自动读取下一个字符
		int ch = 0;
//		ch = fr.read();
		while ((ch=fr.read())!=-1)
			System.out.println("ch="+(char)ch);//将会读取出空格和换行符
		
		*/
		
		/*第二种读取方式： read(char[])返回的是读到字符个数。
		char[] buf = new char[1024];//2k字节，1 char = 2 byte
		int num = 0;
		while((num=fr.read(buf))!=-1)
		{
			System.out.println(num);
			System.out.println(new String(buf,0,num));
		}
		fr.close();
		*/
		
		//第三种读取方式，创建缓冲区，使用readline()方法
		BufferedReader bufr = new BufferedReader(fr);
		String line = null;
		
		while((line=bufr.readLine())!=null)	//读到文件末尾时，返回null,
			//注意：读取一行末尾不包含行终止符
		{
			System.out.println(line);
		}
		bufr.close();
		
		

	}

}
