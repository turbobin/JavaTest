/*
 * 打印流：
 * 该流提供来了打印方法，可以将各种数据类型的数据原样打印
 * 
 * 字节打印流：
 * PringSteam
 * 构造函数可以接收的参数类型：
 * 1，File对象
 * 2，字符串路径，String
 * 3，字节输出流。OutPutStream
 * 
 * 字符打印流（常用）：
 * PrintWriter
 * 1，File对象
 * 2，字符串路径，String
 * 3，字节输出流。OutPutStream
 * 4，字符打印流 。Writer
 */
import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		
//		PrintWriter out = 
//				new PrintWriter(new FileWriter("C:/Users/hmx/Desktop/aaa.txt"),true);
		//true表示自动同步刷新内存数据到目标文件
		
		PrintWriter out = 
				new PrintWriter(new File("C:/Users/hmx/Desktop/aaa.txt"),"utf-8");
		//以指定的字符集输出到目标文件
		
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
