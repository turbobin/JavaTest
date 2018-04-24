/*
 * 字符流和字节流：
 * 
 * 字节流两个基类：
 * inputStream ,  outputStream
 * 
 * 字符流两个基类：
 * Reader , Write
 */
import java.io.*;
public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file = new File("C:/Users/hmx/Desktop/aaa.txt");
//		System.out.println(file);
		FileWriter fw = new FileWriter("C:/Users/hmx/Desktop/aaa.txt");//文件若存在，会被覆盖
//		System.out.println(fw);
		//调用write方法，将字符串写入到流中
//		fw.write("abcdefg\r\n");
//		fw.write("hahahah");
		
		
		//为了提高字符写入流效率，加入了缓冲技术
		BufferedWriter bufw = new  BufferedWriter(fw);
		bufw.write("abcdefg");
		bufw.newLine();//通用换行符
		bufw.write("hahahah");
		//用到缓冲区，记得要刷新
		bufw.flush();
		
		//关闭缓冲区，其实就是在关闭流对象
		bufw.close();
		
		//刷新流对象中的 缓冲中的数据，将流刷到目标文件中
//		fw.flush();
		
		//关闭流资源，关闭之前会刷新一次内部的缓冲,关闭之后不可再写如数据
//		fw.close();
		

	}

}
