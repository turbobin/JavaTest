/*
 * 复制文本文件
 */
import java.io.*;
public class FileCopyText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("MathDemo.java");
		System.out.println(file.getAbsolutePath());	//缺少src目录
		
		FileReader fr = new FileReader("C:/Users/hmx/Desktop/MathDemo.java");
		FileWriter fw = new FileWriter("C:/Users/hmx/Desktop/MathDemo.txt");
		
		char[] buf = new char[1024];
		int len = 0;
		while((len=fr.read(buf))!=-1)	//将会读取出空格和换行符
		{
			fw.write(buf,0,len);
		}
		
		fw.close();
		fr.close();

	}

}
