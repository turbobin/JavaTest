/*
 * 读取键盘录入
 * 字节流和字符流的互相转换 
 * 
 * 流操作的基本规律：
 * 
 * 1，明确源和目的
 * 	源：   输入流 -> InputStream , Reader
 * 	目的：输出流 -> OutputStream ， Writer
 * 
 * 2，明确操作的数据是否是纯文本。
 * 	是 -> 字符流
 * 	否 -> 字节流
 * 
 * 3，体系明确后，再明确要使用哪个具体对象，
 * 通过设备来进行区分：
 * 源设备：内存，硬盘，键盘
 * 目的设备：内存，硬盘 ，控制台
 * 
 * 
 * !!!如果要指定编码表输出，必须使用转换流：
 * InputStreamReader ， OutputStreamWriter
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
		
		/* 改变标准输入输出流，复制文件通用方法(牛~!!)  */
		System.setIn(new FileInputStream("C:/Users/hmx/Desktop/VSAVE.txt"));
		System.setOut(new PrintStream("C:/Users/hmx/Desktop/SAVE.txt"));
		
		/** 3  */
		//获取键盘录入对象，将字节流对象转换成字符流对象，使用转换流：InputStreamReader
		InputStreamReader instr = new InputStreamReader(System.in);
		//为了提高效率，将字符串进行缓冲，使用BufferedReader
		BufferedReader bufr = new BufferedReader(instr);
		
		/** 4  */
		//使用标准输出流，将字符流转换成字节流打印
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
