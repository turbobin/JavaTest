/*
 * 将一个指定目录下的java文件的绝对路径存储到一个文本文件中
 * 建立一个java列表文件
 */
import java.io.*;
import java.util.*;
public class FileDemo1 {
	public static void main(String[] args) throws IOException
	{
		File dir = new File("D:\\Program Files\\Java\\workspace\\JavaTest");
		List<File> list = new ArrayList<File>();
		javaList(dir,list);
		
		System.out.println(list.size());
		
		File filelist = new File(dir,"javalist.txt");
		writeToFile(list,filelist);
	}
	
	public static void javaList(File dir,List<File> list)
	{
		
		File[] fnames = dir.listFiles();
		for(File fname: fnames)
		{
			if(fname.isDirectory())
			{
				javaList(fname,list);
			}
			else
			{
				String s = fname.getName();
				if(s.endsWith(".java"))
				{
					list.add(fname);
				}
			}
		}
		
	}
	public static void writeToFile(List<File> list,File filelist) throws IOException
	{
		BufferedWriter bufw = new BufferedWriter(new FileWriter(filelist));
		for(File file: list)
		{
			bufw.write(file.getAbsolutePath());
			bufw.newLine();
			bufw.flush();
		}
		
		System.out.println("java文件列表已建立，查看："+filelist.getAbsolutePath());
		bufw.close();
	}

}
