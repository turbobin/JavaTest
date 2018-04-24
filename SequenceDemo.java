/*
 * 切割一个大文件，后合并成一个文件
 * 用到顺序流对象：SequenceInputStream
 */
import java.io.*;
import java.util.*;
public class SequenceDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		splitFile();
		mergeFile();

	}
	
	public static void mergeFile() throws IOException
	{
		Vector<FileInputStream> ve = new Vector<FileInputStream>();
		File files = new File("C:\\splitfile");
		String[] file = files.list();
		for (String filename : file)
		{
			ve.add(new FileInputStream("C:\\splitfile\\"+filename));
		}
		Enumeration<FileInputStream> en = ve.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("C:\\splitfile\\merge.wmv");
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=sis.read(buf))!=-1)
		{
			fos.write(buf,0,len);
		}
		fos.close();
		sis.close();
		System.out.println("文件合并成功");
	}
	
	
	public static void splitFile() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Wildlife.wmv");
//		BufferedInputStream bufin = new BufferedInputStream(fis,1024*1024*5);
		
		BufferedOutputStream bufout = null;
				
		byte[] buf = new byte[1024*1024*5];
		int len = 0;
		int count = 1;
		while((len=fis.read(buf))!=-1)
		{
//			System.out.println(len);
			bufout = new BufferedOutputStream(
					new FileOutputStream("C:\\splitfile\\"+(count++)+".part")); 
			
			bufout.write(buf,0,len);
			bufout.close();
			
		}
		
		fis.close();
		System.out.println("文件拆分成功");
	}

}
