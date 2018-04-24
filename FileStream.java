/*
 * 字节流：操作二进制数据
 * 图片或视频
 */
import java.io.*;
public class FileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/Users/hmx/Desktop/me.jpg");
		
		readFile_2(fis);
		
//		FileOutputStream fos = new FileOutputStream("C:/Users/hmx/Desktop/me.bmp");
//		writeFile(fos);

	}
	public static void readFile_3(FileInputStream fis) throws IOException
	{
		int num = fis.available();	
		byte[] buf = new byte[num];//定义一个刚刚好的 数组,文件很大时，不能用 此方法，会把内存写爆！
		fis.read(buf);
		
		System.out.println("num="+num);
		System.out.println(new String(buf));
		
		fis.close();
	}
	
	public static void readFile_2(FileInputStream fis) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("C:/Users/hmx/Desktop/me.bmp");
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read(buf))!=-1)
		{
//			System.out.println(new String(buf,0,len));
			fos.write(buf,0,len);
			
		}
		fis.close();
		fos.close();
	}
	public static void readFile_1(FileInputStream fis) throws IOException
	{
		int ch = 0;
		while((ch=fis.read())!=-1)
		{
			System.out.println((char)ch);
		}
		fis.close();
	}
	public static void writeFile(FileOutputStream fos) throws IOException
	{
		fos.write("abcdef".getBytes());	//对于字节流，直接对最小单位操作，直接写到目标文件中，
				//没有用到缓冲区，所以不需要刷新动作
		
		fos.close();
	}

}
